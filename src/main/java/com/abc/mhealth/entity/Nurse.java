package com.abc.mhealth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nurse_tbl")
public class Nurse {
	
	@Id
	private int nurseId;
	
	@Column(name="name" , nullable = false)
	private String name;
	
	@Column(name="experience" , nullable = false)
	private int experience;
	
	@Column(name="qualification" , nullable = false)
	private String qualification;
	
	@Column(name="contactNumber" , nullable = false)
	private int contactNumber;

	public int getNurseId() {
		return nurseId;
	}

	public void setNurseId(int nurseId) {
		this.nurseId = nurseId;
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

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	
	
	
	

}
