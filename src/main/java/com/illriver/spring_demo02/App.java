package com.illriver.spring_demo02;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.illriver.config.FunctionServiceImpl;
import com.illriver.config.JavaConfig;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args ){
    	
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	
    	FunctionServiceImpl functionServiceImpl = context.getBean(FunctionServiceImpl.class);
    	
    	System.out.println(functionServiceImpl.sayHello("Tony"));
    	
    	context.close();
        
    }
}
