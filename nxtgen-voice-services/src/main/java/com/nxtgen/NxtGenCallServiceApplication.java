package com.nxtgen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nxtgen.service.NextGenAutoBot;

@SpringBootApplication
public class NxtGenCallServiceApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(NxtGenCallServiceApplication.class, args);
		NextGenAutoBot autoBot = context.getBean(NextGenAutoBot.class);
		autoBot.autoCall();
	}
}
