package com.ds.vaultconnection;

import com.ds.vaultconnection.configuration.VaultConfiguration;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class VaultConnectionApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(VaultConnectionApplication.class, args);
        VaultConfiguration vaultConfig = context.getBean(VaultConfiguration.class);
        System.out.println("Login: " +vaultConfig.getLogin());
        System.out.println("Password: " +vaultConfig.getPassword());
    }
}
