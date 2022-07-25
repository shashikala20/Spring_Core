package Demo;

import org.springframework.context.annotation.Bean;

public class AppConfig {
	
	@Bean(name = "address")
	public Address address() {
		return new Address("NDA Road","Pune","Maharastra",411025,"India");
	}
	
	@Bean(name = "customer")
	public Customer customer() {
		Address address = new Address("NDA Road","Pune","Maharastra",411025,"India");
		return new Customer(10000,"Shashikala","9876543210", address);
	}
	

}
