package com.abc.mhealth.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.abc.mhealth.entity.User;

public interface UserRepository extends JpaRepository<User,Integer> {

	@Query("SELECT s FROM User s WHERE s.email= :email and s.password= :pwd")
	public User login(@Param("email")String email, @Param("pwd")String password);

	public User findByEmail(String email);
}
