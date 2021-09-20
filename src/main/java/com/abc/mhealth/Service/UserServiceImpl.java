package com.abc.mhealth.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.abc.mhealth.Exception.DuplicateEntryException;
import com.abc.mhealth.Repository.DoctorAppointmentRepository;
import com.abc.mhealth.Repository.UserRepository;
import com.abc.mhealth.entity.Admin;
import com.abc.mhealth.entity.DoctorAppointment;

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

}
