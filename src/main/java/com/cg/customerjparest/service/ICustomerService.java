package com.cg.customerjparest.service;

import java.util.List;

import com.cg.customerjparest.entities.Customer;

public interface ICustomerService {



	List<Customer> findAll();

	Customer update(Customer customer);

	List<Customer> findByName(String name);

	Customer add(Customer customer);
	
}
