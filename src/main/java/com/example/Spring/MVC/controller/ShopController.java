package com.example.Spring.MVC.controller;


import com.example.Spring.MVC.model.Shop;
import com.example.Spring.MVC.repository.ShopRepositorJPAi;
import com.example.Spring.MVC.repository.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;




@Controller
@RequestMapping("/")
public class ShopController {

    private final ShopRepositorJPAi shopRepository;

    @Autowired
    public ShopController(ShopRepositorJPAi shopRepository) {
        this.shopRepository = shopRepository;
    }

    @GetMapping("/shops")
    public String listShops(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "name") String sort, // параметр сортировки
            Model model) {


        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        model.addAttribute("authorities", authentication.getAuthorities());


        Page<Shop> paginatedShops = shopRepository.findAll(PageRequest.of(page, size, Sort.by(sort))); //

        model.addAttribute("shops", paginatedShops.getContent());
        model.addAttribute("currentPage", page);
        model.addAttribute("totalPages", paginatedShops.getTotalPages());

        return "shop-list";
    }


    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/shops/add")
    public String showAddShopForm(Model model) {
        model.addAttribute("shop", new Shop());
        return "shop-add";
    }

    @PostMapping("/shops/add")
    public String addShop(@ModelAttribute Shop shop) {
        shopRepository.save(shop);
        return "redirect:/shops";
    }

    @GetMapping("/shops/{id}")
    public String viewShop(@PathVariable Long id, Model model) {
        Optional<Shop> shop = shopRepository.findById(id);
        if (shop.isPresent()) {
            model.addAttribute("shop", shop.get());
            return "shop-detail";
        }
        return "redirect:/shops";
    }

    @GetMapping("/shops/{id}/edit")
    public String showEditShopForm(@PathVariable Long id, Model model) {
        Optional<Shop> shop = shopRepository.findById(id);
        if (shop.isPresent()) {
            model.addAttribute("shop", shop.get());
            return "shop-edit";
        }
        return "redirect:/shops";
    }

    @PostMapping("/shops/{id}/edit")
    public String editShop(@PathVariable Long id, @ModelAttribute Shop shop) {
        Optional<Shop> existingShop = shopRepository.findById(id);
        if (existingShop.isPresent()) {
            Shop updatedShop = existingShop.get();
            updatedShop.setName(shop.getName());
            updatedShop.setAddress(shop.getAddress());
            updatedShop.setPhone(shop.getPhone());
            updatedShop.setEmail(shop.getEmail());
            updatedShop.setWebsite(shop.getWebsite());
            updatedShop.setCategory(shop.getCategory());
            updatedShop.setDescription(shop.getDescription());

            shopRepository.save(updatedShop);
        }
        return "redirect:/shops";
    }


    @PostMapping("/shops/{id}/delete")
    public String deleteShop(@PathVariable Long id) {
        try {
            shopRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            System.out.println("Не удалось удалить магазин с ID: " + id);
        }
        return "redirect:/shops";
    }

    @GetMapping("/shops/{id}/delete")
    public String handleDeleteGet(@PathVariable Long id) {
        return "redirect:/access-denied";
    }


    @GetMapping("/shops/search")
    public String searchShops(@RequestParam String query, Model model) {
        List<Shop> result = shopRepository
                .findByNameContainingIgnoreCaseOrCategoryContainingIgnoreCaseOrAddressContainingIgnoreCase(
                        query, query, query);

        model.addAttribute("shops", result);
        return "shop-list";
    }
}
