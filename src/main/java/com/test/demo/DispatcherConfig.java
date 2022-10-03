package com.test.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.demo.bean.Car;
import com.test.demo.bean.Hyundai;
import com.test.demo.bean.Maruti;

@Configuration
public class DispatcherConfig {

	@Bean 
	@Qualifier("hyundai")
	public Car getHyundai() {
		return new Hyundai();
	}
	
	@Bean 
	@Qualifier("maruti")
	public Car getMaruti() {
		return new Maruti();
	}
}
