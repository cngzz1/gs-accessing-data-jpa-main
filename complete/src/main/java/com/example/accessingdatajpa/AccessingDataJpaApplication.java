package com.example.accessingdatajpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class AccessingDataJpaApplication<E> {
	static final String LASTNAME_BAUER = "Bauer";
	private static final Logger log = LoggerFactory.getLogger(AccessingDataJpaApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(AccessingDataJpaApplication.class);
	}

	@Bean
	public CommandLineRunner demo(CustomerRepository<E> repository) {
		return args -> {
			// save a few customers
			repository.save(new Customer<>("Jack", LASTNAME_BAUER));
			repository.save(new Customer<>("Chloe", "O'Brian"));
			repository.save(new Customer<>("Kim", LASTNAME_BAUER));
			repository.save(new Customer<>("David", "Palmer"));
			repository.save(new Customer<>("Michelle", "Dessler"));

			// fetch all customers
			log.info("Customers found with findAll():");
			log.info("-------------------------------");
			Iterable<Customer<E>> customerRepo = repository.findAll();
			for (final Customer<E> customer : customerRepo) {
				for(final String s : List.of(customer.toString())){
					log.info(s);
				}
			}
			log.info("");

			// fetch an individual customer by ID
			Customer<E> customer = repository.findById(1L);
			log.info("Customer found with findById(1L):");
			log.info("--------------------------------");
			for (String s : List.of(customer.toString(), "", "Customer found with findByLastName('Bauer'):", "--------------------------------------------")) {
				log.info(s);
			}

			// fetch customers by last name
			repository.findByLastName(LASTNAME_BAUER).forEach(bauer -> log.info(bauer.toString()));
			log.info("");
		};
	}

}
