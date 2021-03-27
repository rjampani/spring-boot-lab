package com.springboot.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import com.springboot.events.TranscationNotificationEvent;

@Component
public class POSMachine implements ApplicationEventPublisherAware {
	
	private ApplicationEventPublisher  applicationEventPublisher;
	
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher = applicationEventPublisher;
	}
	
	public void withdrawAndSandNotification(String mobileNo, String amount) {
		System.out.println("====POSMachine publising TranscationNotificationEvent=====");
		TranscationNotificationEvent event = new TranscationNotificationEvent(this);
		event.setAccountType("savings");
		event.setAmount(amount);
		event.setMachineNo("WER234");
		event.setMobileNo(mobileNo);
		event.setOperationType("withdrawl");
		event.setTransactionNo("TX23R532SDF");
		
		applicationEventPublisher.publishEvent(event);
		System.out.println("====POSMachine after publishing TransactionNotificationEvent====");
		
	}

}
