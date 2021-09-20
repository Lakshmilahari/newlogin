package com.abc.mhealth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="center_tbl")
public class Center {
	
	@Id
	private int centerId;
	
	@Column(name="centerName" , nullable = false)
	private String centerName;
	
	@Column(name="location" , nullable = false)
	private String location;
	
	@Column(name="contactNumber" , nullable = false)
	private int contactNumber;

	public int getCenterId() {
		return centerId;
	}

	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}

	public String getCenterName() {
		return centerName;
	}

	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	


}
