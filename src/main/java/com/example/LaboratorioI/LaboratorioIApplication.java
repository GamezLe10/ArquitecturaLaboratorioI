package com.example.LaboratorioI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.LaboratorioI")
public class LaboratorioIApplication {

	public static void main(String[] args) {
		SpringApplication.run(LaboratorioIApplication.class, args);
	}

	@Bean
	public CommandLineRunner loadData(InitDataLoader loader) {
		return args -> loader.loadData();
	}

}
