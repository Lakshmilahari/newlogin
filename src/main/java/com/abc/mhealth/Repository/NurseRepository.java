package com.abc.mhealth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.mhealth.entity.Nurse;

public interface NurseRepository extends JpaRepository<Nurse,Integer>{

}
