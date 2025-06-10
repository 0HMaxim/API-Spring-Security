
package com.example.Spring.MVC.repository;

import com.example.Spring.MVC.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ShopRepositorJPAi extends JpaRepository<Shop, Long> {
    List<Shop> findByNameContainingIgnoreCaseOrCategoryContainingIgnoreCaseOrAddressContainingIgnoreCase(
            String name, String category, String address);
}