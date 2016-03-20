/**
 * 
 */
package com.mayank.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mayank.app.dao.SampleRepo;
import com.mayank.app.dto.SampleEntity;

/**
 * @author Maverick
 *
 */

@Service
public class SampleServiceImpl {

	
	@Autowired
	SampleEntity sampleEntity;

	@Autowired
	SampleRepo sampleRepo; 
	
	public SampleEntity getSamples(){
		
		sampleEntity = sampleRepo.getOne((long) 1);
		
		return sampleEntity;
	}
	
}
