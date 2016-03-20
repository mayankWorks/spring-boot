/**
 * 
 */
package com.mayank.app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mayank.app.dto.SampleEntity;
import com.mayank.app.service.SampleServiceImpl;

/**
 * @author Maverick
 *
 */
@RestController
@RequestMapping("/")
//@SpringBootApplication
public class SampleApi {
	
	@Autowired
	SampleServiceImpl sampleService;
	
	@Autowired
	SampleEntity sampleEntity;
	
	@RequestMapping(value="/hello",produces={"application/json"})
	public @ResponseBody SampleEntity hello(){
		
		sampleEntity = sampleService.getSamples();
		
		return sampleEntity;
		
		//return "hello dear !!";
	}
	
	
/*	public static void main(String[] args) {
		SpringApplication.run(MainApi.class, args);
	}*/

}
