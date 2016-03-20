/**
 * 
 */
package com.mayank.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author Maverick
 *
 */
 
@SpringBootApplication//exclude = { ErrorMvcAutoConfiguration.class}
//@EnableAutoConfiguration  // Sprint Boot Auto Configuration
//@ComponentScan//(basePackages = "com.khoubyari.example")
public class Application {

	private static final Class<Application> applicationClass = Application.class;

	public static void main(String[] args) {
		SpringApplication.run(applicationClass, args);
	}

    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }
	
    
}
