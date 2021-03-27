package com.nxtgen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.tarang.voip.service.TarangCallManager;

@Component
public class NextGenAutoBot {
	
	@Autowired
	private TarangCallManager callManager;
	
	public void autoCall() {
		boolean status = false;
		status = callManager.placeCall("2343243243");
		System.out.println("autoCall status: " + status);
	}

}
