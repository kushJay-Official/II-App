package com.iispring.iiapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DemoController {
	@Autowired
    private CustomerRespository customerRespository;
	@PostMapping("/add")
    public String addCustomer(@RequestParam String first, @RequestParam String last){
    Customer customer = new Customer();
    customer.setFirstName(first);
    customer.setSurName(last);
    customerRespository.save(customer);
    return "Added new customer to repo!";
}

	@GetMapping("/list")
	public Iterable<Customer> getCustomers() {
  		  return customerRespository.findAll();}

    @GetMapping("/find/{id}")
    public Customer findCustomerById(@PathVariable Integer id) {
        return customerRespository.findCustomerById(id);
    }
}
