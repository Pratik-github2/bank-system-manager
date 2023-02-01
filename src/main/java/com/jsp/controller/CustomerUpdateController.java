package com.jsp.controller;

import com.jsp.service.CustomerService;

public class CustomerUpdateController {
	public static void main(String[] args) {
		CustomerService customerService=new CustomerService();
		
		//Enter the customerId and update field
		customerService.updateCustomerName(3, "pratik");
		customerService.updateCustomerGmail(3, "pratik@gmail.com");
		customerService.updateCustomerCno(2, 892806940);
	}
}
