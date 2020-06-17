package com.scp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableCaching
@EnableScheduling
public class SpringbootconfigpropertiesApplication {

	public static void main(String[] args) {
		//-Dspring.profiles.active=e0
		System.setProperty(AbstractEnvironment.ACTIVE_PROFILES_PROPERTY_NAME, "e0");
		SpringApplication.run(SpringbootconfigpropertiesApplication.class, args);
	}

}
