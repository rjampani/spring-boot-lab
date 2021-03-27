package com.springboot.dao;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {
	
	private static final String GET_ACCOUNT_TYPE_BY_ACCOUNT_NO = "select balance from account where account_no = ?";
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public double getBalanceByAccountNo(int accountNo) {
		return jdbcTemplate.queryForObject(GET_ACCOUNT_TYPE_BY_ACCOUNT_NO, Double.class, accountNo);
	}

}
