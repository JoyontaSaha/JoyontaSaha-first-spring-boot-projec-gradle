package com.in28minutes.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;

//@SpringBootApplication
//@ComponentScan("com.in28minutes")
public class FirstSpringbootProjectGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringbootProjectGradleApplication.class, args);
	}
	
	  @Profile("dev")
	  @Bean
	  public String dummy() {
			return "Dummy Bean";
		}

}
