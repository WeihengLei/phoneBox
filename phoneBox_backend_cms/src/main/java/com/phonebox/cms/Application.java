package com.phonebox.cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;


@SpringBootApplication
@ComponentScan(basePackages = {"com.phonebox.cms","com.phonebox.core"})
@EnableCaching
@EnableMongoRepositories(value = {"com.phonebox.core.repository"})

public class Application{

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

}