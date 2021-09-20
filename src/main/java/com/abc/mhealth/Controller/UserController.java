package com.abc.mhealth.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.abc.mhealth.Repository.UserRepository;
import com.abc.mhealth.Service.UserService;
import com.abc.mhealth.entity.Center;
import com.abc.mhealth.entity.Doctor;
import com.abc.mhealth.entity.DoctorAppointment;
import com.abc.mhealth.entity.Nurse;
import com.abc.mhealth.entity.Status;
import com.abc.mhealth.entity.User;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserRepository userRepository;

    @PostMapping("/register")
    public Status registerUser(@Valid @RequestBody User newUser) {
        List<User> users = userRepository.findAll();

        System.out.println("New user: " + newUser.toString());

        for (User user : users) {
            System.out.println("Registered user: " + newUser.toString());

            if (user.equals(newUser)) {
                System.out.println("User Already exists!");
                return Status.USER_ALREADY_EXISTS;
            }
        }

        userRepository.save(newUser);
        return Status.SUCCESS;
    }

    @PostMapping("/login")
    public Status loginUser(@Valid @RequestBody User user) {
        List<User> users = userRepository.findAll();

        for (User other : users) {
            if (other.equals(user)) {
                user.setLoggedIn(true);
                userRepository.save(user);
                return Status.SUCCESS;
            }
        }

        return Status.FAILURE;
    }

    @PostMapping("/logout")
    public Status logUserOut(@Valid @RequestBody User user) {
        List<User> users = userRepository.findAll();

        for (User other : users) {
            if (other.equals(user)) {
                user.setLoggedIn(false);
                userRepository.save(user);
                return Status.SUCCESS;
            }
        }

        return Status.FAILURE;
    }

    @DeleteMapping("/all")
    public Status deleteUsers() {
        userRepository.deleteAll();
        return Status.SUCCESS;
    }
    
    @Autowired
    private UserService userService;
    
    @PostMapping("/doctorAppointment")
	public ResponseEntity<String> addCenter(@Valid @RequestBody DoctorAppointment doctorAppointment) {
		userService.doctorAppointment(doctorAppointment);
		return new ResponseEntity<>("Appointment booked successfully with doctor(with ID) = " + doctorAppointment.getDoctorId() +"on "+doctorAppointment.getAppDate()+" at "+doctorAppointment.getTime(),HttpStatus.CREATED);
	}
    
  
	@GetMapping("/alldoctor")
	public ResponseEntity<List<Doctor>> getAllDoctors(){
		List<Doctor> doctors= userService.searchAllDoctor();
		return new ResponseEntity<>(doctors,HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<Doctor> getAccountDetails(@PathVariable("id") int doctorId) {
		Doctor doctor = userService.searchDoctorById(doctorId);
		return new ResponseEntity<>(doctor,HttpStatus.OK);
	}
	
	@GetMapping("/allnurse")
	public ResponseEntity<List<Nurse>> getAllNurse(){
		List<Nurse> nurses= userService.searchAllNurse();
		return new ResponseEntity<>(nurses,HttpStatus.OK);
	}
	
	@GetMapping("/getnurse/{id}")
	public ResponseEntity<Nurse> getNurseDetails(@PathVariable("id") int nurseId) {
		Nurse nurse = userService.searchNurseById(nurseId);
		return new ResponseEntity<>(nurse,HttpStatus.OK);
	}
    
    
}