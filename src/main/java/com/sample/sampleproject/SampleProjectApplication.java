package com.sample.sampleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SampleProjectApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SampleProjectApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationBuilder) {
		return applicationBuilder.sources(SampleProjectApplication.class);
	}
}
