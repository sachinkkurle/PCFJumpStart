package learn.avinash.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import learn.avinash.springframework.domain.Order;

public interface OrderRepository extends CrudRepository<Order, Integer>{

}
