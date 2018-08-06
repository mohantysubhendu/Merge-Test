package com.subhendu.shoppingApp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subhendu.shoppingApp.model.CustomerModel;
import com.subhendu.shoppingApp.repository.CustomerRepository;
@Service
public class CustomerServiceImp implements CustomerService{

	@Autowired
	private CustomerRepository customerRepository;
	
	

	public CustomerRepository getCustomerRepository() {
		return customerRepository;
	}

	public void setCustomerRepository(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}



	@Override
	public void deleteByid(String id) {
		// TODO Auto-generated method stub
		this.customerRepository.deleteById(id);
		
	}

	@Override
	public CustomerModel save(CustomerModel customerModel) {
		// TODO Auto-generated method stub
		return getCustomerRepository().save(customerModel);
	}

	@Override
	public CustomerModel updateCustomerDetails(CustomerModel customerModel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CustomerModel findByid(String id) {
		// TODO Auto-generated method stub
		return this.customerRepository.findByid(id);
	}

	@Override
	public List<CustomerModel> findByName(String customername) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<CustomerModel> listAllCustomers() {
		// TODO Auto-generated method stub
		return getCustomerRepository().findAll();
	}

}
