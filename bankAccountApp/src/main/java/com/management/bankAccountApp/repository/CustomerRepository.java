package com.management.bankAccountApp.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.management.bankAccountApp.dto.Customer;

@Repository
public class CustomerRepository {
	
	    @Autowired
	    JdbcTemplate template;

	    /*Getting all Customers from table*/
	    public List<Customer> getAllCustomers(){
	        List<Customer> Customers = template.query("select id,name,username, password, address, state, country , email, pan, contact, dob, accountType from Customer",(result,rowNum)->new Customer(result.getInt("id"),
	                result.getString("name"),result.getString("username"),result.getString("password"), result.getString("address"), result.getString("state"),
	                result.getString("country"),result.getString("email"),result.getString("pan"),result.getString("contact"),result.getString("dob"),
	                result.getString("accountType")));
	        return Customers;
	    }
	    /*Getting a specific Customer by Customer id from table*/
	    public Customer getCustomer(int CustomerId){
	        String query = "SELECT * FROM Customer WHERE ID=?";
	        Customer customer = template.queryForObject(query,new Object[]{CustomerId},new BeanPropertyRowMapper<>(Customer.class));

	        return customer;
	    }
	    /*Adding an Customer into database table*/
	    public int addCustomer(int id,String name,String username, String password, String address, String state,String country,
	    		String email, String pan,String contact, String dob, String accountType){
	        String query = "INSERT INTO Customer VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
	        return template.update(query,id,name,username, password, address, state, country , email, pan, contact, dob, accountType);
	    }
	    
	    /*Adding an Customer into database table*/
	    public int updateCustomer(int id,String name, String address, String state,String country,
	    		String email, String pan,String contact, String dob, String accountType){
	        String query = "UPDATE Customer SET name=?, address=?,state=?,country=?,email=?,pan=?,contact=?,dob=?,accountType=? where ID=?";
	        return template.update(query , name, address, state, country , email, pan, contact, dob, accountType, id);
	    }

}
