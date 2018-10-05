package learn.avinash.springframework.repositories;

import org.springframework.data.repository.CrudRepository;

import learn.avinash.springframework.domain.Product;


public interface ProductRepository extends CrudRepository<Product, Integer> {
}
