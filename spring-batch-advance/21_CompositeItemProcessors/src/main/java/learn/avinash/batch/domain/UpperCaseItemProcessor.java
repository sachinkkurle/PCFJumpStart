
package learn.avinash.batch.domain;

import org.springframework.batch.item.ItemProcessor;

public class UpperCaseItemProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer item) throws Exception {
		return new Customer(item.getId(),
				item.getFirstName().toUpperCase(),
				item.getLastName().toUpperCase(),
				item.getBirthdate());
	}
}
