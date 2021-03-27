package com.springboot.listenerhandler;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.springboot.events.TranscationNotificationEvent;

@Component
public class MobileNotificationListenerHandler implements ApplicationListener<TranscationNotificationEvent>{

	public void onApplicationEvent(TranscationNotificationEvent event) {
		System.out.println("===MobileNotificationListenerHandler recevied event====");
		System.out.println(event);
		System.out.println("====MobileNotificationListenerHandler event processing completed====");
	}
	
}
