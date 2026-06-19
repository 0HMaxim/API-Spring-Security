package com.example.Spring.MVC.repository;

import com.example.Spring.MVC.model.Shop;
import com.example.Spring.MVC.repository.ShopRepositorJPAi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DataLoader implements CommandLineRunner {
    private final ShopRepositorJPAi shopRepository;

    public DataLoader(ShopRepositorJPAi shopRepository) {
        this.shopRepository = shopRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        shopRepository.save(new Shop("Shop No. 3",  "51 Olesia Honchara St",        "555-555-5555", "shop3@example.com",  "http://shop3.com",  "Household",        "Home goods store."));
        shopRepository.save(new Shop("Shop No. 4",  "10 Khreshchatyk St",           "111-222-3333", "shop4@example.com",  "http://shop4.com",  "Electronics",      "Latest gadgets and electronics."));
        shopRepository.save(new Shop("Shop No. 5",  "7 Lva Tolstoho St",            "222-333-4444", "shop5@example.com",  "http://shop5.com",  "Clothing",         "Fashionable clothes for everyone."));
        shopRepository.save(new Shop("Shop No. 6",  "14 Velyka Vasylkivska St",     "333-444-5555", "shop6@example.com",  "http://shop6.com",  "Bookstore",        "Wide selection of books and stationery."));
        shopRepository.save(new Shop("Shop No. 7",  "3 Khoryva St",                 "444-555-6666", "shop7@example.com",  "http://shop7.com",  "Pharmacy",         "Medicines and health products."));
        shopRepository.save(new Shop("Shop No. 8",  "22 Antonovycha St",            "555-666-7777", "shop8@example.com",  "http://shop8.com",  "Electronics",      "Computers, phones and accessories."));
        shopRepository.save(new Shop("Shop No. 9",  "8 Dmytrivska St",              "666-777-8888", "shop9@example.com",  "http://shop9.com",  "Bakery",           "Fresh bread and pastries daily."));
        shopRepository.save(new Shop("Shop No. 10", "45 Kotliarevskogo St",         "777-888-9999", "shop10@example.com", "http://shop10.com", "Garden",           "Garden and outdoor goods."));
        shopRepository.save(new Shop("Shop No. 11", "10 Preobrazhenska St",         "888-999-0000", "shop11@example.com", "http://shop11.com", "Furniture",        "Furniture and interior design."));
        shopRepository.save(new Shop("Shop No. 12", "5 Nezalezhnosti St",           "999-000-1111", "shop12@example.com", "http://shop12.com", "Auto Parts",       "Car parts and accessories."));
        shopRepository.save(new Shop("Shop No. 13", "6 Hrushevskogo St",            "000-111-2222", "shop13@example.com", "http://shop13.com", "Coffee & Tea",     "Coffee and tea products."));
        shopRepository.save(new Shop("Shop No. 14", "23 Artema St",                 "111-222-3456", "shop14@example.com", "http://shop14.com", "Sports",           "Sports goods and equipment."));
        shopRepository.save(new Shop("Shop No. 15", "18 Mayakovskogo St",           "222-333-6789", "shop15@example.com", "http://shop15.com", "Pet Supplies",     "Products for pets."));
        shopRepository.save(new Shop("Shop No. 16", "4 Sholem-Alekhema St",         "333-444-4321", "shop16@example.com", "http://shop16.com", "Appliances",       "Home appliances and gadgets."));
    }
}
