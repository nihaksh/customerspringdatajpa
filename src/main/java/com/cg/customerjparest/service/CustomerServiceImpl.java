package com.cg.customerjparest.service;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.customerjparest.dao.*;
import com.cg.customerjparest.entities.Customer;



@Transactional
@Service
public class CustomerServiceImpl implements ICustomerService {
    private static final Logger Log= LoggerFactory.getLogger(CustomerServiceImpl.class);
    @Autowired
    private ICustomerDao dao;


    @Override
    public Customer add(Customer customer) {
        
        customer = dao.save(customer);
        return customer;
    }


	@Override
	public Customer update(Customer customer){
		
		customer=dao.save(customer);
        return customer;
	}
		
	@Override
	  public List<Customer> findAll() {
	        List<Customer> list = dao.findAll();
	        return list;
	    }
	
	@Override
	public	List<Customer> findByName(String name){
		List<Customer> list = dao.findByName(name);
        return list;
	}

	
	}




