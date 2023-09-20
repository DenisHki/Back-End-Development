package com.chuvakov.customers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.chuvakov.customers.domain.Customer;
import com.chuvakov.customers.domain.CustomerDAOImpl;




@SpringBootApplication
public class CustomersApplication {
	private static final Logger log = LoggerFactory.getLogger(CustomersApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(CustomersApplication.class, args);
	}

	@Bean
	public CommandLineRunner demo(CustomerDAOImpl customerDAO) {
		return (args) -> {
			// Database is created by using resources/schema.sql
			
			// Insert some demo data
	        //customerDAO.save(new Customer("John", "Smith", "jsmith@gmail.com"));
	        //customerDAO.save(new Customer("Denis", "Chuvakov", "chuv@gmail.com"));
	        //customerDAO.save(new Customer("Anna", "Fomchenkova", "anna@gmail.fi"));
	       
		};
	}	
}
