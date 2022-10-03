package com.test.demo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.test.demo.bean.Employee;
import com.test.demo.mapper.EmployeeMapper;

@Repository
public class SimpleDao {
	
	@Autowired
	NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	public String homePage() {
		final String query = "select * from Employee";
		final Map<String,Object> parammap = new HashMap<String,Object>();
		
		List<Employee> empList = this.namedParameterJdbcTemplate.query(query, parammap, new EmployeeMapper());
		
		return empList.get(0).getEmployeeName();
	}
	
	
}
