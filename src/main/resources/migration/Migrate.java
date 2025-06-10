package com.example.Spring.MVC.migration;

import org.flywaydb.core.Flyway;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Migrate {

    @PostConstruct
    public void migrate() {
        Flyway flyway = Flyway.configure()
                .locations("classpath:db/migration")
                .load();
        flyway.migrate();
    }
}
