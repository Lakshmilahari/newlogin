package com.abc.mhealth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="doctor_tbl")
public class Doctor {
	
//	@NotNull(message = "Doctor id is required")
	@Id
	private long doctorId;
	
//	@NotNull(message = "Doctor experience is required")
	@Column(name="experience")
	private int experience;
	
//	@NotNull(message = "Doctor Specialty is required")
	@Column(name="Specialty")
	private String Specialty;
	
//	@NotNull(message = "Doctor consultationPrice is required")
	@Column(name="consultationPrice")
	private double consultationPrice;
	
//	@NotNull(message = "Doctor contactNumber is required")
	@Column(name="contactNumber")
	private long contactNumber;
	
//	@NotNull(message = "Doctor modeOfConsultation is required")
	@Column(name="modeOfConsultation")
	private String modeOfConsultation;
	
	
	public long getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getSpecialty() {
		return Specialty;
	}
	public void setSpecialty(String specialty) {
		Specialty = specialty;
	}
	public double getConsultationPrice() {
		return consultationPrice;
	}
	public void setConsultationPrice(double consultationPrice) {
		this.consultationPrice = consultationPrice;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getModeOfConsultation() {
		return modeOfConsultation;
	}
	public void setModeOfConsultation(String modeOfConsultation) {
		this.modeOfConsultation = modeOfConsultation;
	}
	
	
	

}
