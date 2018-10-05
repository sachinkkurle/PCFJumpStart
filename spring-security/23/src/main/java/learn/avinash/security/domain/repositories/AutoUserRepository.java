package learn.avinash.security.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import learn.avinash.security.domain.entities.AutoUser;

public interface AutoUserRepository extends JpaRepository<AutoUser, Long> {

	public AutoUser findByUsername(String username);
}
