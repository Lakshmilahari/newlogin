package com.abc.mhealth.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.mhealth.Repository.AdminRepository;
import com.abc.mhealth.Repository.DoctorRepository;
import com.abc.mhealth.entity.Admin;
import com.abc.mhealth.entity.Center;
import com.abc.mhealth.entity.Doctor;
import com.abc.mhealth.entity.Nurse;
import com.abc.mhealth.Exception.DuplicateEntryException;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminRepository adminRepository;

	@Override
	public void saveAdmin(Admin admin) throws  DuplicateEntryException{
		// TODO Auto-generated method stub

		Optional<Admin> optionalAccount = adminRepository.findById(admin.getAdminId());
		if(optionalAccount.isPresent()) {
			throw new DuplicateEntryException("Account already exists with Account number :"+admin.getAdminId());
		}
		adminRepository.save(admin);
			
		}
	
	@Autowired
	private DoctorRepository doctorRepository;

	@Override
	public void addDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		Optional<Admin> optionalAccount = doctorRepository.findById(doctor.getDoctorId());
		if(optionalAccount.isPresent()) {
			throw new DuplicateEntryException("Account already exists with Account number :"+doctor.getDoctorId());
		}
		doctorRepository.save(doctor);
		
	}

	@Override
	public void updateAccountDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountDoctor(int doctorId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addNurse(Nurse nurse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAccountNurse(Nurse nurse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNurse(int nurseId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addCenter(Center center) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateAccountCenter(Center center) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountCenter(int centerId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doLogin(Admin admin) {
		// TODO Auto-generated method stub
		
	}

		
	}


