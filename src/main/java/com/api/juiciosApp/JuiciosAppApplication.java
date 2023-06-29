package com.api.juiciosApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EnableJpaRepositories("com.*")
@EntityScan("com.*")
@ComponentScan(basePackages = { "com.*" })
//@EnableResourceServer
public class JuiciosAppApplication extends SpringBootServletInitializer {
	
	  @Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	    return application.sources(JuiciosAppApplication.class);
	  }

	public static void main(String[] args) {
		SpringApplication.run(JuiciosAppApplication.class, args);
	}
	
	


}

