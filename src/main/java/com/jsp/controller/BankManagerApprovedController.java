package com.jsp.controller;

import com.jsp.service.AdminService;

public class BankManagerApprovedController {
	public static void main(String[] args) {
		AdminService adminService=new AdminService();
		
		//Enter the admin id for approve all bankManagers
//		adminService.approvedBankManager(1);       
		
		
		//Enter the bankManager id and admin id for approve particular bankManager
		adminService.approvedBankManager(4,1);	  
	}
}
