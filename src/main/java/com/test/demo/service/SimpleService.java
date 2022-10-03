package com.test.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.demo.dao.SimpleDao;

@Service
public class SimpleService {
	
	@Autowired
	SimpleDao simpleDao;
	
	public String homePage() {
		return simpleDao.homePage();
	}
}
