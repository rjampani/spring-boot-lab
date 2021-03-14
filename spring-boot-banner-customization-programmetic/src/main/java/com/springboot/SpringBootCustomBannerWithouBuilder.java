package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springboot.banner.AppBanner;

@SpringBootApplication
public class SpringBootCustomBannerWithouBuilder {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringBootCustomBannerWithouBuilder.class);
		//application.setBannerMode(Mode.OFF);
		application.setBanner(new AppBanner());
		application.run(args);
	}

}
