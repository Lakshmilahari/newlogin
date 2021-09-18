package com.abc.mhealth.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.mhealth.Service.AdminService;
import com.abc.mhealth.entity.Admin;
import com.abc.mhealth.entity.Doctor;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/login")
	public ResponseEntity<Object> doLogin(@Valid @RequestBody Admin admin){
		
		boolean r1 = admin.getAdminEmail().equals("admin@email.com");
		boolean r2 = admin.getAdminPassword().equals("adminpassword");
		int res=0;
		if(r1 && r2) {
			res ++;
		}
		if(res!=1) {
			return new ResponseEntity<>("Wrong Details",HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>("Succcessful Login : "+admin.getAdminEmail(),HttpStatus.OK);
		
	}
	
//	@Autowired
//	private DoctorService doctorService;
	
	 
	@PostMapping("/addDoctor")
	public ResponseEntity<String> addDoctor(@Valid @RequestBody Doctor doctor) {
		adminService.addDoctor(doctor);
		return new ResponseEntity<>("Account saved successfully with accno = " + doctor.getDoctorId(),HttpStatus.CREATED);
	}

}
