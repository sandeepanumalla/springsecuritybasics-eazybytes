package com.eazybytes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories("")
@SpringBootApplication
// @ComponentScans({ @ComponentScan("com.eazybytes.Controller"), @ComponentScan("com.eazybytes.Config")})
// @EnableJpaRepositories("com.eazybytes.Repository")
// @EntityScan("com.eazybytes.Model")
public class EazyBankBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(EazyBankBackendApplication.class, args);
    }
}