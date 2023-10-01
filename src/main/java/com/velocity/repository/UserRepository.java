package com.velocity.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.velocity.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	// get id
	public User findById(Integer id);
}
