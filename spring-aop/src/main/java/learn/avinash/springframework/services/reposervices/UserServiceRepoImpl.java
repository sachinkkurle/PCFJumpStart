package learn.avinash.springframework.services.reposervices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import learn.avinash.springframework.domain.User;
import learn.avinash.springframework.repositories.CustomerRepository;
import learn.avinash.springframework.repositories.UserRepository;
import learn.avinash.springframework.services.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 12/21/15.
 */
@Service
@Profile("springdatajpa")
public class UserServiceRepoImpl implements UserService {

    private UserRepository userRepository;
    private CustomerRepository customerRepository;

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<?> listAll() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add); //fun with Java 8
        return users;
    }

    @Override
    public User getById(Integer id) {
        return userRepository.findOne(id);
    }

    @Override
    public User saveOrUpdate(User domainObject) {
        return userRepository.save(domainObject);
    }

    @Override
    @Transactional
    public void delete(Integer id) {
        User user = userRepository.findOne(id);
        customerRepository.delete(user.getCustomer());
        userRepository.delete(user);
    }

    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUsername(userName);
    }
}