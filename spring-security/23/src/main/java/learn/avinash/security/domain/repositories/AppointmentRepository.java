package learn.avinash.security.domain.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import learn.avinash.security.domain.entities.Appointment;
import learn.avinash.security.domain.entities.AutoUser;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
	public List<Appointment> findByUser(AutoUser user);

}
