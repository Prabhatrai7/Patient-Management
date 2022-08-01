package com.cts.patient.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

import com.cts.patient.model.Patient;
import com.cts.patient.service.PatientService;

//fill the code
@Configuration
@ComponentScan("com.cts.patient")
@PropertySource("classpath:patient_details.properties")
public class AppConfig {

	//fill the code
	@Bean
	Patient patient() {
		return new Patient();
	}
	
	@Bean
	PatientService patientService() {
		return new PatientService();
	}
}
