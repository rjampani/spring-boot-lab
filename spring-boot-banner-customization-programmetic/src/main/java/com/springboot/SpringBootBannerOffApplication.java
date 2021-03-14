package com.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.builder.SpringApplicationBuilder;

public class SpringBootBannerOffApplication {
	public static void main(String[] args) {
		SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringBootBannerOffApplication.class);
		builder.bannerMode(Mode.OFF);
		builder.build().run(args);
	}
}
