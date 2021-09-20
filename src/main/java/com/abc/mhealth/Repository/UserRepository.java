package com.abc.mhealth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.mhealth.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}