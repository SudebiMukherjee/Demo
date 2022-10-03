package com.test.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.test.demo.bean.Employee;

public class EmployeeMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		final Employee employee = new Employee();
		employee.setEmployeeId(rs.getInt(1));
		employee.setEmployeeName(rs.getString(2));
		return employee;
	}
	

}
