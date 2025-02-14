package com.JobFinder.Joblisting;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class JoblistingApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoblistingApplication.class, args);
	}

	@Bean
	public GroupedOpenApi api() {
		return GroupedOpenApi.builder()
				.group("jobfinder")
				.packagesToScan("com.JobFinder.Joblisting")
				.build();
	}
}
