package learn.avinash.security.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import learn.avinash.security.domain.entities.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

}
