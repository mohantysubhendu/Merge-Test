package com.subhendu.shoppingApp.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.subhendu.shoppingApp.model.CustomerModel;

public interface CustomerService {
	Iterable<CustomerModel> listAllCustomers();
	void deleteByid(String id);
	CustomerModel save(CustomerModel customerModel);
	CustomerModel updateCustomerDetails(CustomerModel customerModel);
	CustomerModel findByid(String id);
	List<CustomerModel> findByName(String customername);
	
	

}
