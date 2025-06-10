package com.example.Spring.MVC.repository;

import com.example.Spring.MVC.model.Shop;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ShopRepository {

    private final List<Shop> shops = new ArrayList<>();

    public List<Shop> findAll() {
        return new ArrayList<>(shops);
    }

    public Optional<Shop> findById(Long index) {
        if (index >= 0 && index < shops.size()) {
            return Optional.of(shops.get(Math.toIntExact(index)));
        }
        return Optional.empty();
    }

    public void save(Shop shop) {
        shops.add(shop);
    }

    public void update(int index, Shop shop) {
        if (index >= 0 && index < shops.size()) {
            shops.set(index, shop);
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < shops.size()) {
            shops.remove(index);
        }
    }

    public int count() {
        return shops.size();
    }
}
