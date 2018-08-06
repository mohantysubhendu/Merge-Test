package com.subhendu.shoppingApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.subhendu.shoppingApp.model.CustomerModel;
import com.subhendu.shoppingApp.services.CustomerService;



@RestController
@RequestMapping("/base")
@CrossOrigin(origins="*")
public class Controller {
	
	@Autowired	
	private CustomerService custService;
	

	
	/*public Controller(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}*/
	
	

	public CustomerService getCustService() {
		return custService;
	}





	public void setCustService(CustomerService custService) {
		this.custService = custService;
	}

	//CustomerModel customerModel1=new CustomerModel( "10","Siddharth","2144252454","bbsr","jhdbweb@bbd.com");

	//@GetMapping(value="/save")
	//@PostMapping(value="/save")
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public CustomerModel save(@RequestBody CustomerModel customerModel)
	{
		System.out.println(customerModel.getName());
		//CustomerModel customerModel1=new CustomerModel( "0","Siddharth","2144252454","bbsr","jhdbweb@bbd.com");
		
		return getCustService().save(customerModel);
		
	}
	
/*	
	@GetMapping(value="/save")
	public CustomerModel save( )
	{
		
		
				return getCustService().save(customerModel1);
	}*/
	
	
	
/*	@GetMapping(value="/fetchAll")
	public Iterable<CustomerModel> getAllCustomers(){
		return this.custService.listAllCustomers();
	}*/
	
	@GetMapping(value="/fetchAll")
	public Iterable<CustomerModel> getAllCustomers(){
		return this.custService.listAllCustomers();
	}
	
	
	
/*	@GetMapping("/delete/{id}")
	public void deleteCustomer(){
		
		custService.deleteByid(customerModel1.getId());
	}*/
	
	@GetMapping("/delete/{id}")
	public Iterable<CustomerModel> deleteCustomer(@PathVariable("id") String id){
		
		custService.deleteByid(id);
		return this.custService.listAllCustomers();
	}
	
	/*@PostMapping(value="/edit/save/{id}")
	public CustomerModel edit(@PathVariable("id") String id, @RequestBody CustomerModel customerModel ){
			
		CustomerModel customerModel1= new CustomerModel();
		customerModel1.setId(id);
		customerModel1.setName(customerModel1.getName());
		customerModel1.setMobileNo(customerModel1.getMobileNo());
		customerModel1.setAddress(customerModel1.getAddress());
		customerModel1.setEmailId(customerModel1.getEmailId());
	
		 return this.custService.save(customerModel1);
		 
	}*/
	
	
	@GetMapping(value="/customer/{id}")
	public CustomerModel viewCustomer(@PathVariable("id") String id){
		return this.custService.findByid(id);
	}
	

   /*@GetMapping(value="/customer")
	public CustomerModel viewCustomer(){
	   String idNew="12";
		return this.custService.findByid(idNew);
	}*/
	
}
