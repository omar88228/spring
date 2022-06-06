package it.immobile.immobilePrj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class ImmobilePrjApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImmobilePrjApplication.class, args);
	}

}
