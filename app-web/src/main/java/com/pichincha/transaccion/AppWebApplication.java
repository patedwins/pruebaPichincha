package com.pichincha.transaccion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@ComponentScan(basePackages = { "com.pichincha.transaccion" })
@EnableJpaRepositories("com.pichincha.transaccion.core.repository")
public class AppWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppWebApplication.class, args);
	}

}
