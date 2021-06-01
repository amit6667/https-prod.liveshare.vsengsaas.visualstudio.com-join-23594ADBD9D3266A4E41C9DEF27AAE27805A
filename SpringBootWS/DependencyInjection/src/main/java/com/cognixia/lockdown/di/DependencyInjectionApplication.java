package com.cognixia.lockdown.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {
	
	
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(DependencyInjectionApplication.class, args);
		
		Demo demo = (Demo) ctx.getBean("demo");
		demo.run();
		
		
	}

}
