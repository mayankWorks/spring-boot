/**
 * 
 */
package com.mayank.app.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 * @author Maverick
 *
 */
 
@SpringBootApplication()//exclude = { ErrorMvcAutoConfiguration.class}
//@ComponentScan
//@EnableAutoConfiguration
public class Application  extends SpringBootServletInitializer{

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}

}
