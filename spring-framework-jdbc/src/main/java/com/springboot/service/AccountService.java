package com.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.dao.AccountDAO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO accountDAO; 
	
	@Transactional(readOnly = true)
	public double getBalance(int accountNo) {
		return accountDAO.getBalanceByAccountNo(accountNo);
	}
}
