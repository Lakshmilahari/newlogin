package com.abc.mhealth.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.mhealth.Repository.AdminRepository;
import com.abc.mhealth.Repository.CenterRepository;
import com.abc.mhealth.Repository.DoctorRepository;
import com.abc.mhealth.Repository.NurseRepository;
import com.abc.mhealth.entity.Admin;
import com.abc.mhealth.entity.Center;
import com.abc.mhealth.entity.Doctor;
import com.abc.mhealth.entity.Nurse;
import com.abc.mhealth.Exception.DuplicateEntryException;
import com.abc.mhealth.Exception.ResourceNotExistingException;

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
	public void addDoctor(Doctor doctor) throws  DuplicateEntryException{
		// TODO Auto-generated method stub
		Optional<Doctor> optionalAccount = doctorRepository.findById(doctor.getDoctorId());
		if(optionalAccount.isPresent()) {
			throw new DuplicateEntryException("Account already exists with Account number :"+doctor.getDoctorId());
		}
		doctorRepository.save(doctor);
		
	}


	@Override
	public void deleteAccountDoctor(int doctorId) {
		// TODO Auto-generated method stub
		Optional<Doctor> optionalAccount=doctorRepository.findById(doctorId);
		if(optionalAccount.isEmpty()) {
			throw new ResourceNotExistingException("Account Doesnt Exist with ID:"+doctorId);
		}
		doctorRepository.deleteById(doctorId);
		
	}
	
	@Override
	public void updateAccountDoctor(Doctor doctor) {
		// TODO Auto-generated method stub
		Optional<Doctor> optionalAccount = doctorRepository.findById(doctor.getDoctorId());
		if(optionalAccount.isEmpty()) {
			throw new ResourceNotExistingException("Account Doesnt Exist with ID:"+doctor.getDoctorId());
		}
		doctorRepository.save(doctor);
		
	}
	
	@Autowired
	private NurseRepository nurseRepository;

	@Override
	public void addNurse(Nurse nurse) throws  DuplicateEntryException{
		// TODO Auto-generated method stub
		Optional<Nurse> optionalAccount = nurseRepository.findById(nurse.getNurseId());
		if(optionalAccount.isPresent()) {
			throw new DuplicateEntryException("Account already exists with Account number :"+nurse.getNurseId());
		}
		nurseRepository.save(nurse);
		
	}

	@Override
	public void updateAccountNurse(Nurse nurse) {
		// TODO Auto-generated method stub
		Optional<Nurse> optionalAccount = nurseRepository.findById(nurse.getNurseId());
		if(optionalAccount.isEmpty()) {
			throw new ResourceNotExistingException("Account Doesnt Exist with ID:"+nurse.getNurseId());
		}
		nurseRepository.save(nurse);
		
	}

	@Override
	public void deleteAccountNurse(int nurseId) {
		// TODO Auto-generated method stub
		Optional<Nurse> optionalAccount=nurseRepository.findById(nurseId);
		if(optionalAccount.isEmpty()) {
			throw new ResourceNotExistingException("Account Doesnt Exist with ID:"+nurseId);
		}
		nurseRepository.deleteById(nurseId);
		
	}

	
	@Autowired
	private CenterRepository centerRepository;
	
	
	@Override
	public void addCenter(Center center) throws  DuplicateEntryException{
		// TODO Auto-generated method stub
		Optional<Center> optionalAccount = centerRepository.findById(center.getCenterId());
		if(optionalAccount.isPresent()) {
			throw new DuplicateEntryException("Account already exists with Account number :"+center.getCenterId());
		}
		centerRepository.save(center);
		
	}

	@Override
	public void updateAccountCenter(Center center) {
		// TODO Auto-generated method stub
		Optional<Center> optionalAccount = centerRepository.findById(center.getCenterId());
		if(optionalAccount.isEmpty()) {
			throw new ResourceNotExistingException("Account Doesnt Exist with ID:"+center.getCenterId());
		}
		centerRepository.save(center);
		
	}

	@Override
	public void deleteAccountCenter(int centerId) {
		// TODO Auto-generated method stub
		Optional<Center> optionalAccount=centerRepository.findById(centerId);
		if(optionalAccount.isEmpty()) {
			throw new ResourceNotExistingException("Account Doesnt Exist with ID:"+centerId);
		}
		centerRepository.deleteById(centerId);
		
	}


		
}


