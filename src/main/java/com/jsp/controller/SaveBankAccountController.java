package com.jsp.controller;

import com.jsp.dto.BankAccountDto;
import com.jsp.service.CustomerService;

public class SaveBankAccountController {
	public static void main(String[] args) {
		BankAccountDto bankAccount=new BankAccountDto();
		
		//Enter the account number
		bankAccount.setAccount_no(123456758);
		
		//Enter the ifsc_code
		bankAccount.setIfsc_code("HDFC");
		
		//Enter the amount
		bankAccount.setBalance(10000);
		
		CustomerService customerService=new CustomerService();
		
		//Enter the bankAccount and customerId
		customerService.saveBankAccount(bankAccount,3);
	}
}
