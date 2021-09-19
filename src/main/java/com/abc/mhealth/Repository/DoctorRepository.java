package com.abc.mhealth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.mhealth.entity.Admin;
import com.abc.mhealth.entity.Doctor;

public interface DoctorRepository extends JpaRepository<Admin,Integer>{

//	void save(Doctor doctor);
	
}
