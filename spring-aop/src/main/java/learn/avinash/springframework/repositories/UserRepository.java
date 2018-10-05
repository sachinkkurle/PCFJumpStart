package learn.avinash.springframework.repositories;
import org.springframework.data.repository.CrudRepository;

import learn.avinash.springframework.domain.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);

}
