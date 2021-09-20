package com.abc.mhealth.Controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.mhealth.Service.AdminService;
import com.abc.mhealth.entity.Admin;
import com.abc.mhealth.entity.Center;
import com.abc.mhealth.entity.Doctor;
import com.abc.mhealth.entity.Nurse;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	@PostMapping("/login")
	public ResponseEntity<Object> doLogin(@Valid @RequestBody Admin admin){
		
		boolean r1 = admin.getEmail().equals("admin@email.com");
		boolean r2 = admin.getPassword().equals("adminpassword");
		int res=0;
		if(r1 && r2) {
			res ++;
		}
		if(res!=1) {
			return new ResponseEntity<>("Wrong Details",HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>("Succcessful Login : "+admin.getAdminId(),HttpStatus.OK);
		
	}
	@PostMapping("/save")
	public ResponseEntity<String> saveAccount(@Valid @RequestBody Admin admin) {
		adminService.saveAdmin(admin);
		return new ResponseEntity<>("Account saved successfully with accno = " + admin.getAdminId(),HttpStatus.CREATED);
	}
	

	@PostMapping("/addDoctor")
	public ResponseEntity<String> addDoctor(@Valid @RequestBody Doctor doctor) {
		adminService.addDoctor(doctor);
		return new ResponseEntity<>("Doctor added successfully with id = " + doctor.getDoctorId(),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteDoctor/{id}")
	public ResponseEntity<String> deleteAccount(@PathVariable("id")int doctorId){
		
		adminService.deleteAccountDoctor(doctorId);
		return new ResponseEntity<>("Doctor deleted Successfully",HttpStatus.OK);
		
	}
	
	@PutMapping("/updateDoctor")
	public ResponseEntity<String> updateAccount(@RequestBody Doctor doctor) {
		
		adminService.updateAccountDoctor(doctor);
		return new ResponseEntity<>("Doctor updated Successfully",HttpStatus.OK);
		
	}
	
	
	@PostMapping("/addNurse")
	public ResponseEntity<String> addNurse(@Valid @RequestBody Nurse nurse) {
		adminService.addNurse(nurse);
		return new ResponseEntity<>("Nurse added successfully with id = " + nurse.getNurseId(),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteNurse/{id}")
	public ResponseEntity<String> deleteAccountNurse(@PathVariable("id")int nurseId){
		
		adminService.deleteAccountDoctor(nurseId);
		return new ResponseEntity<>("Nurse deleted Successfully",HttpStatus.OK);
		
	}
	
	@PutMapping("/updateNurse")
	public ResponseEntity<String> updateAccountNurse(@RequestBody Nurse nurse) {
		
		adminService.updateAccountNurse(nurse);
		return new ResponseEntity<>("Nurse updated Successfully",HttpStatus.OK);
		
	}
	
	
	
	
	@PostMapping("/addCenter")
	public ResponseEntity<String> addCenter(@Valid @RequestBody Center center) {
		adminService.addCenter(center);
		return new ResponseEntity<>("Center added successfully with name = " + center.getCenterName(),HttpStatus.CREATED);
	}
	
	@DeleteMapping("/deleteCenter/{id}")
	public ResponseEntity<String> deleteAccountCenter(@PathVariable("id")int centerId){
		
		adminService.deleteAccountCenter(centerId);
		return new ResponseEntity<>("Center deleted Successfully",HttpStatus.OK);
		
	}
	
	@PutMapping("/updateCenter")
	public ResponseEntity<String> updateAccountCenter(@RequestBody Center center) {
		
		adminService.updateAccountCenter(center);
		return new ResponseEntity<>("Center updated Successfully",HttpStatus.OK);
		
	}

}
