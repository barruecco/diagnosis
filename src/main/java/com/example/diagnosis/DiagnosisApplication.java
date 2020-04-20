package com.example.diagnosis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableBinding(Processor.class)

public class DiagnosisApplication {
	static ApplicationContext applicationContext;
	public static void main(String[] args) {
		applicationContext = SpringApplication.run(DiagnosisApplication.class, args);

	}

}
