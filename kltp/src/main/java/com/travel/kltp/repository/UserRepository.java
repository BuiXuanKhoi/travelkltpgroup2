package com.travel.kltp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.travel.kltp.entities.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	@Query(value = "select * from user where user_id = :id")
	User findUserById(int id);

}
