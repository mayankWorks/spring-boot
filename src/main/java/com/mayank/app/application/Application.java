/**
 * 
 */
package com.mayank.app.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ErrorMvcAutoConfiguration;

/**
 * @author Maverick
 *
 */
@SpringBootApplication(exclude = { ErrorMvcAutoConfiguration.class})
//@ComponentScan
//@EnableAutoConfiguration
public class Application {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}

}
