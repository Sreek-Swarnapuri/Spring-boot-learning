package com.sreek.Springbootlearning;

import com.sreek.Springbootlearning.config.ApplicationProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class})
public class SpringBootLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLearningApplication.class, args);
	}

}

@Component
class AppInitializer implements CommandLineRunner {

	@Autowired
	private ApplicationProperties properties;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application properties: " + properties);
	}
}