package com.abc.mhealth.Service;

import java.util.List;

import com.abc.mhealth.entity.Doctor;
import com.abc.mhealth.entity.DoctorAppointment;
import com.abc.mhealth.entity.Nurse;

public interface UserService {
	
	public void doctorAppointment(DoctorAppointment doctorAppointment);
	
    public List<Doctor> searchAllDoctor();
	
	//public List<Doctor> searchDoctorBySpeacilty(String Specialty);
	
	public Doctor searchDoctorById(int doctorId);
	
	public List<Nurse> searchAllNurse();
	
	public List<Nurse> searchNurseBySpecialty(String Specialty);
	
	public Nurse searchNurseById(int nurseId);

}
