package com.subhendu.shoppingApp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.subhendu.shoppingApp.model.CustomerModel;




@Repository
public interface CustomerRepository extends MongoRepository<CustomerModel,String>
{
	List<CustomerModel> findByName(String customername);
	CustomerModel findByid(String id);
	void deleteByid(String id);
	

}
