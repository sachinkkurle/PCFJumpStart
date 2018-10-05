package learn.avinash.springframework.services;

import learn.avinash.springframework.command.CustomerForm;
import learn.avinash.springframework.domain.Customer;

/**
 * Created by jt on 11/14/15.
 */
public interface CustomerService extends CRUDService<Customer> {
	Customer saveOrUpdateCustomerForm(CustomerForm customerForm);

}
