package com.springboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@ComponentScan(basePackages = {"com.springboot.service"})
@EnableTransactionManagement
public class ServiceConfig {

}
