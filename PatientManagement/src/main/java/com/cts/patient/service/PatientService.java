package com.cts.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.patient.model.Patient;

@Service
public class PatientService {

	//fill the code
	private Patient patient;

	public void getPatientDetails() {
		//fill the code
		String result = "Patient Id : " + patient.getPid() + "\nPatient Name : " + patient.getPname() + "\nDisease : " + patient.getDisease() + "\nSex : " + patient.getSex() + "\nAdmit Status : " + patient.getAdmit_status() + "\nAge : " + patient.getAge();
		System.out.println(result);
		
	}

	public Patient getPatient() {
		return patient;
	}

	@Autowired
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
}
