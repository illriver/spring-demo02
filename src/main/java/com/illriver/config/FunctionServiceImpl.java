package com.illriver.config;

public class FunctionServiceImpl {
	
	FunctionService functionService;
	
	public void setFunctionService(FunctionService functionService) {
		this.functionService=functionService;
		
	}
	public String sayHello(String word) {
		return functionService.sayHello(word);
	}

}
