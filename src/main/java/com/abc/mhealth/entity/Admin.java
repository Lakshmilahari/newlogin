package com.abc.mhealth.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="admin_tbl")
public class Admin {
	
	@NotNull(message = "Admin email is required")
	@Id
	private String adminEmail;
	
	@NotNull(message = "Admin password is required")
	@Column(name="adminPassword")
	private String adminPassword;
	
	
	public String getAdminEmail() {
		return adminEmail;
	}
	public void setAdminEmail(String adminEmail) {
		this.adminEmail = adminEmail;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	
	

}
