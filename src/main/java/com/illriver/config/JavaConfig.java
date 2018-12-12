package com.illriver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public FunctionService functionService() {
		return new FunctionService();
	}
	
	@Bean
	public FunctionServiceImpl functionServiceImpl() {
		FunctionServiceImpl functionServiceImpl = new FunctionServiceImpl();
		functionServiceImpl.setFunctionService(functionService());
		return functionServiceImpl;
	}
		
	
	/*@Bean
	public FunctionServiceImpl functionServiceImpl(FunctionService functionService) {
		FunctionServiceImpl functionServiceImpl = new FunctionServiceImpl();
		functionServiceImpl.setFunctionService(functionService);
		return functionServiceImpl;
	}*/
	
	
	
}
