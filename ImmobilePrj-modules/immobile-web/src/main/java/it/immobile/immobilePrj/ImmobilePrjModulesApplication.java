package it.immobile.immobilePrj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan("it.immobile.immobilePrj")
public class ImmobilePrjModulesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImmobilePrjModulesApplication.class, args);
	}

}
