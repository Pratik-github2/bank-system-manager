package com.jsp.controller;

import com.jsp.service.AdminService;

public class AdminUpdateController {
	public static void main(String[] args) {
		AdminService adminService=new AdminService();
		
		//Enter the admin id and update field
		adminService.updateAdminName(2, "PratikR");
		adminService.updateAdminGmail(2, "PratikR@gmail.com");
		adminService.updateAdminCno(2, 1234567096);
	}
}