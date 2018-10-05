package learn.avinash.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import learn.avinash.springframework.domain.Customer;
import learn.avinash.springframework.services.CustomerService;

public interface CustomerRepository extends CrudRepository<Customer, Integer>{

}
