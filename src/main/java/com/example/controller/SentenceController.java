package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.service.SentenceService;

// Controller <--> Service <--> DAO <--> Domain
// The controller has been simplified to do only web work, the task of assembling the sentence is now in the service layer. 

@Controller
public class SentenceController {
	
	@Autowired SentenceService sentenceService;
	
	
	/**
	 * Display a small list of Sentences to the caller:
	 */
	@RequestMapping("/sentence")
	public @ResponseBody String getSentence() {
	  return 
		"<h3>Some Sentences</h3><br/>" +	  
		sentenceService.buildSentence() + "<br/><br/>" +
		sentenceService.buildSentence() + "<br/><br/>" +
		sentenceService.buildSentence() + "<br/><br/>" +
		sentenceService.buildSentence() + "<br/><br/>" +
		sentenceService.buildSentence() + "<br/><br/>"
		;
	}

}
