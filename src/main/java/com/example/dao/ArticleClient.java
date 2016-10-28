package com.example.dao;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.domain.Word;

//The below line says (@FeignCLient("ARTICLE"), invoke API http://localhost:8906 by referring Eureka Client ID
//http://localhost:8906 --> API will return the article word configured in the application-article.properties files
//The value from the API service will be populated to domain object Word and return to the Service
//Service will return it to the controller


@FeignClient("ARTICLE")
public interface ArticleClient {

	@RequestMapping(value="/", method=RequestMethod.GET)
	public Word getWord();

}
