package com.airsante.airmes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class AirmesApplication
		extends SpringBootServletInitializer
		{

	public static void main(String[] args) {
		SpringApplication.run(AirmesApplication.class, args);
		
	}

}

