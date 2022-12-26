package com.ds.vaultconnection;

import com.ds.vaultconnection.configuration.VaultConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class VaultConnectionApplication implements CommandLineRunner {

    @Value("${login}")
    private String login;
    @Value("${password}")
    private String password;
    private final VaultConfiguration vaultConfiguration;

    public VaultConnectionApplication(VaultConfiguration vaultConfiguration) {
        this.vaultConfiguration = vaultConfiguration;
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(VaultConnectionApplication.class, args);
        VaultConfiguration vaultConfig = context.getBean(VaultConfiguration.class);
        System.out.println("Dentro do main");
        System.out.println("Login: " +vaultConfig.getLogin());
        System.out.println("Password: " +vaultConfig.getPassword());
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Dentro do run");
        System.out.println("Login: " +this.vaultConfiguration.getLogin());
        System.out.println("Password: " +this.vaultConfiguration.getPassword());

        System.out.println("Diretamente através do Value");
        System.out.println("Login: " +login);
        System.out.println("Password: " +password);
    }
}
