package com.chuvakov.customers.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.chuvakov.customers.domain.Customer;
import com.chuvakov.customers.domain.CustomerDAO;


@Controller
public class CustomerController {
	@Autowired
    private CustomerDAO customerDAO;
    
    @RequestMapping(value="/customers")
    public String customertList(Model model) {	
        // Fetch all customers
        List<Customer> customers = customerDAO.findAll();
        // Add customerlist to model and return view name
        model.addAttribute("customers", customers);
        return "customerlist";
    }	
    
    // Add new student
    @RequestMapping(value = "/add")
    public String addCustomer(Model model){
    	model.addAttribute("customer", new Customer());
        return "addcustomer";
    }     
    
    // Save new student
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(Customer customer){
        customerDAO.save(customer);
        return "redirect:customers";
    }    
}
