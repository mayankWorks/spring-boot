/**
 * 
 */
package com.mayank.app.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Maverick
 *
 */
@RestController
//@RequestMapping("/")
//@SpringBootApplication
public class MainApi {

	@RequestMapping(value="/hello")
	public @ResponseBody String hello(){
		
		return "hello dear !!";
	}
	
/*	public static void main(String[] args) {
		SpringApplication.run(MainApi.class, args);
	}*/

}
