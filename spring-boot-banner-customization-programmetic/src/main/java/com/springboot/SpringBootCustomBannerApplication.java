package com.springboot;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import com.springboot.banner.AppBanner;

@SpringBootApplication
public class SpringBootCustomBannerApplication {
	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringBootCustomBannerApplication.class);
		builder.banner(new AppBanner());
		builder.build().run(args);
	}
}
