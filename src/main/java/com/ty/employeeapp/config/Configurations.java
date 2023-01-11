package com.ty.employeeapp.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

	@Configuration
	public class Configurations {
		
		@Bean
		public EntityManagerFactory getEntityManagerFactory() {
			return Persistence.createEntityManagerFactory("dev");
		}
		
	}


