package com.abc.mhealth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctor_tbl")
public class Doctor {
	
	@Id
	private int doctorId;
	
	@Column(name="name" , nullable = false)
	private String name;
	
	@Column(name="experience" , nullable = false)
	private int experience;
	
	@Column(name="Specialty" , nullable = false)
	private String specialty;
	
	@Column(name="consultationPrice" , nullable = false)
	private int consultationPrice;
	
	@Column(name="contactNumber" , nullable = false)
	private int contactNumber;
	
	@Column(name="modeOfConsultation" , nullable = false)
	private String modeOfConsultation;

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public double getConsultationPrice() {
		return consultationPrice;
	}

	public void setConsultationPrice(int consultationPrice) {
		this.consultationPrice = consultationPrice;
	}

	public double getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getModeOfConsultation() {
		return modeOfConsultation;
	}

	public void setModeOfConsultation(String modeOfConsultation) {
		this.modeOfConsultation = modeOfConsultation;
	}
	
	
	
	

}
