package com.tarang.voip.autoconfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.tarang.voip.service.TarangCallManager;

@Configuration
@ConditionalOnClass(name = "com.tarang.voip.service.TarangCallManager")
public class TarangCallManagerAutoCofigure {
	
	@Autowired
	private Environment env;
	
	@Bean
	public TarangCallManager callManager() {
		TarangCallManager callManager = new TarangCallManager();
		callManager.setId(env.getProperty("tarang.id"));
		callManager.setAccesskey(env.getProperty("tarang.accesskey"));
		callManager.setProtocol(env.getProperty("tarang.protocol"));
		callManager.setHost(env.getProperty("tarang.host"));
		return callManager;
	}
}
