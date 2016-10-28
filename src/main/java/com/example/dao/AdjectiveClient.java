package com.example.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.Word;


// The below line says (@FeignCLient("ADJECTIVE"), invoke API http://localhost:8907 by referring Eureka Client ID
// http://localhost:8907 --> API will return the adjective word configured in the application-adjective.properties files
// The value from the API service will be populated to domain object Word and return to the Service
// Service will return it to the controller

@FeignClient("ADJECTIVE")
public interface AdjectiveClient {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public Word getWord();

	
/*	static class HystrixClientFallback implements AdjectiveClient {

		@Override

		public Word getWord() {

		return new Word();

		}	
	}*/	
}
