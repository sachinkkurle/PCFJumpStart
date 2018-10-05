package learn.avinash.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import learn.avinash.springframework.domain.security.Role;

public interface RoleRepsoitory extends CrudRepository<Role, Integer>{

}
