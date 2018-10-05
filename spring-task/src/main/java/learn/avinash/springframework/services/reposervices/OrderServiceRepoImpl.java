package learn.avinash.springframework.services.reposervices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import learn.avinash.springframework.domain.Order;
import learn.avinash.springframework.repositories.OrderRepository;
import learn.avinash.springframework.services.OrderService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 12/21/15.
 */
@Service
@Profile("springdatajpa")
public class OrderServiceRepoImpl implements OrderService {

    private OrderRepository orderRepository;

    @Autowired
    public void setOrderRepository(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public List<?> listAll() {
        List<Order> orders = new ArrayList<>();
        orderRepository.findAll().forEach(orders::add); //fun with Java 8
        return orders;
    }

    @Override
    public Order getById(Integer id) {
        return orderRepository.findOne(id);
    }

    @Override
    public Order saveOrUpdate(Order domainObject) {
        return orderRepository.save(domainObject);
    }

    @Override
    public void delete(Integer id) {
        orderRepository.delete(id);
    }
}