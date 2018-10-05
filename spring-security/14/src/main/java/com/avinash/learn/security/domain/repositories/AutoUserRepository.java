package com.avinash.learn.security.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avinash.learn.security.domain.entities.AutoUser;

public interface AutoUserRepository extends JpaRepository<AutoUser, Long> {
	public AutoUser findByUsername(String username);
}
