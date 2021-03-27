package com.springboot;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springboot.config.RootConfig;
import com.springboot.service.AccountService;

public class SpringJdbcTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RootConfig.class);
		AccountService accountService = context.getBean(AccountService.class);
		double balance = accountService.getBalance(3301);
		System.out.println("balance: " + balance);
	}
}
