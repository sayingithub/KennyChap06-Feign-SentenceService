package com.example.service;

/**
 * Describes a demo.service that will build a sentence, somehow, some way.
 */

//The controller has been simplified to do only web work, the task of assembling the sentence is now in the service layer.

public interface SentenceService {

	public String buildSentence();

}
