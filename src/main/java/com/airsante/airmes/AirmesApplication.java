package com.airsante.airmes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Classe Main de l'application
 * @author jerome.vinet
 * @since 2019.03.28
 */
@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AirmesApplication {
    public static void main(String[] args) {
        SpringApplication.run(AirmesApplication.class, args);
    }
}



