package com.abc.mhealth.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.mhealth.Exception.DuplicateEntryException;
import com.abc.mhealth.Exception.ResourceNotExistingException;
import com.abc.mhealth.Repository.DoctorAppointmentRepository;
import com.abc.mhealth.Repository.DoctorRepository;
import com.abc.mhealth.Repository.NurseRepository;
import com.abc.mhealth.entity.Admin;
import com.abc.mhealth.entity.Doctor;
import com.abc.mhealth.entity.DoctorAppointment;
import com.abc.mhealth.entity.Nurse;

@Service
public class UserServiceImpl implements UserService {

	@Override
	public void doctorAppointment(DoctorAppointment doctorAppointment) throws  DuplicateEntryException {
		// TODO Auto-generated method stub
//		Optional<DoctorAppointment> optionalAccount = DoctorAppointmentRepository.findById(doctorAppointment.getAppId());
//		if(optionalAccount.isPresent()) {
//			throw new DuplicateEntryException("Account already exists with Account number :"+admin.getAdminId());
//		}
//		adminRepository.save(admin);
//		
		
	}
	
	@Autowired
	//private UserRepository userRepository;
	private DoctorRepository doctorRepository;
	
	@Autowired
	private NurseRepository nurseRepository;
	
	@Override
	public List<Doctor> searchAllDoctor() {
		
		List<Doctor> doctorList = doctorRepository.findAll();
		return doctorList;
		
	}

	//@Override
	//public List<Doctor> searchDoctorBySpeacilty(String Specialty) {
		//return doctorRepository.findByName(Specialty);
	//}

	@Override
	public Doctor searchDoctorById(int doctorId) {
		Optional<Doctor> optionalDoctor = doctorRepository.findById(doctorId);		
		if(optionalDoctor.isEmpty()) {			
			throw new ResourceNotExistingException("Account is not existing with id: "+doctorId);			
		}
		Doctor account = optionalDoctor.get();		
		return account;
	}

	@Override
	public List<Nurse> searchAllNurse() {
		List<Nurse> nurseList = nurseRepository.findAll();
		return nurseList;
		
	}

	@Override
	public List<Nurse> searchNurseBySpecialty(String Specialty) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Nurse searchNurseById(int nurseId) {
		Optional<Nurse> optionalNurse = nurseRepository.findById(nurseId);		
		if(optionalNurse.isEmpty()) {			
			throw new ResourceNotExistingException("Account is not existing with id: "+nurseId);			
		}
		Nurse nurse = optionalNurse.get();		
		return nurse;
	}

	
	

}
