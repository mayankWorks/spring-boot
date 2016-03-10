/**
 * 
 */
package com.mayank.app.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Maverick
 *
 */


@RestController
//@RequestMapping("/")
@SpringBootApplication
public class MainApi {

	@RequestMapping("/hello")
	public String hello(){
		
		return "hello dear !!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(MainApi.class, args);
	}

}
