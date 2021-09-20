package com.abc.mhealth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.mhealth.entity.DoctorAppointment;


public interface DoctorAppointmentRepository extends JpaRepository<DoctorAppointment,Integer>{

}
