package com.myshop.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.context.WebApplicationContext;

@SpringBootApplication
public class MyshopApplication extends SpringBootServletInitializer {

/*	@Override
	   protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(MyshopApplication.class);
	   }*/

	public static void main(String[] args) {
		SpringApplication.run(MyshopApplication.class, args);
	}

}
