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
        shopRepository.save(new Shop("Магазин №4", "ул. Шевченка, 12", "123-123-1234", "shop4@example.com", "http://shop4.com", "Электроника", "Магазин бытовой электроники и аксессуаров."));
        shopRepository.save(new Shop("Магазин №5", "ул. Леси Украинки, 7", "222-222-2222", "shop5@example.com", "http://shop5.com", "Книги", "Книжный магазин с широким выбором литературы."));
        shopRepository.save(new Shop("Магазин №6", "ул. Садовая, 15", "333-333-3333", "shop6@example.com", "http://shop6.com", "Одежда", "Магазин одежды и обуви для всей семьи."));
        shopRepository.save(new Shop("Магазин №7", "ул. Мира, 8", "444-444-4444", "shop7@example.com", "http://shop7.com", "Косметика", "Магазин косметики и парфюмерии."));
        shopRepository.save(new Shop("Магазин №8", "ул. Независимости, 1", "555-555-1234", "shop8@example.com", "http://shop8.com", "Игрушки", "Магазин игрушек для детей всех возрастов."));
        shopRepository.save(new Shop("Магазин №9", "ул. Григоренко, 3", "666-666-5678", "shop9@example.com", "http://shop9.com", "Спецодежда", "Магазин спецодежды и средств индивидуальной защиты."));
        shopRepository.save(new Shop("Магазин №10", "ул. Котляревського, 45", "777-777-6789", "shop10@example.com", "http://shop10.com", "Сад и огород", "Магазин товаров для сада и огорода."));
        shopRepository.save(new Shop("Магазин №11", "ул. Преображенская, 10", "888-888-1234", "shop11@example.com", "http://shop11.com", "Мебель", "Магазин мебели и интерьеров."));
        shopRepository.save(new Shop("Магазин №12", "ул. Ленина, 5", "999-999-5678", "shop12@example.com", "http://shop12.com", "Автозапчасти", "Магазин автозапчастей и аксессуаров."));
        shopRepository.save(new Shop("Магазин №13", "ул. Грушевского, 6", "000-000-4321", "shop13@example.com", "http://shop13.com", "Кофе", "Магазин кофе и чайной продукции."));
        shopRepository.save(new Shop("Магазин №14", "ул. Артема, 23", "111-111-3456", "shop14@example.com", "http://shop14.com", "Спорттовары", "Магазин спортивных товаров и инвентаря."));
        shopRepository.save(new Shop("Магазин №15", "ул. Маяковского, 18", "222-222-6789", "shop15@example.com", "http://shop15.com", "Товары для животных", "Магазин товаров для домашних животных."));
        shopRepository.save(new Shop("Магазин №16", "ул. Шолом-Алейхема, 4", "333-333-4321", "shop16@example.com", "http://shop16.com", "Техника", "Магазин бытовой техники и гаджетов."));
        shopRepository.save(new Shop("Магазин №3", "ул. Олеся Гончара, 51", "555-555-5555", "shop3@example.com", "http://shop3.com", "Господарственный", "Магазин товаров для дома."));
    }
}
