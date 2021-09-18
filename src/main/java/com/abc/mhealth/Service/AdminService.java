package com.abc.mhealth.Service;


import com.abc.mhealth.entity.Admin;
import com.abc.mhealth.entity.Center;
import com.abc.mhealth.entity.Doctor;
import com.abc.mhealth.entity.Nurse;

public interface AdminService {
	
	public void doLogin(Admin admin);
	
	public void addDoctor(Doctor doctor);
	
	public void updateAccountDoctor(Doctor doctor);
	
	public void deleteAccountDoctor(int doctorId);
	
	public void addNurse(Nurse nurse);
	
	public void updateAccountNurse(Nurse nurse);
	
	public void deleteAccountNurse(int nurseId);
	
	public void addCenter(Center center);
	
	public void updateAccountCenter(Center center);
	
	public void deleteAccountCenter(int centerId);

}
