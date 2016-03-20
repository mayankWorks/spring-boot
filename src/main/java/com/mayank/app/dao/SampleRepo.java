/**
 * 
 */
package com.mayank.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mayank.app.dto.SampleEntity;

/**
 * @author Maverick
 *
 */

public interface SampleRepo extends JpaRepository<SampleEntity, Long>{

	
}
