package com.abc.mhealth.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doctorappointment_tbl")
public class DoctorAppointment {
	
	@Id
	@GeneratedValue(strategy = 	GenerationType.IDENTITY)
	private int appId;
	
	@Column(name="userName" , nullable = false)
	private String userName;
	
	@Column(name="doctorId" , nullable = false)
	private int doctorId;
	
	@Column(name="appDate" , nullable = false)
	private LocalDate appDate;
	
	@Column(name="time" , nullable = false)
	private LocalDateTime time;

	public int getAppId() {
		return appId;
	}

	public void setAppId(int appId) {
		this.appId = appId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	public LocalDate getAppDate() {
		return appDate;
	}

	public void setAppDate(LocalDate appDate) {
		this.appDate = appDate;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	
	
	
	

}
