package edu.wctc.wholesale;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DistJavaWholesaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DistJavaWholesaleApplication.class, args);
	}

	//I can't get this to work for the life of me
	// i spent way too much time trying to get it
	// to work with no luck the browser gives me a 404 when i try to go to localhost:63342
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				// Address of IntelliJ's web preview server
				registry.addMapping("/api/**").allowedOrigins("http://localhost:63342");
			}
		};
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
