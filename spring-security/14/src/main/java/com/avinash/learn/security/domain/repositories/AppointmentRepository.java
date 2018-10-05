package com.avinash.learn.security.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.avinash.learn.security.domain.entities.Appointment;
import com.avinash.learn.security.domain.entities.AutoUser;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
  
}
