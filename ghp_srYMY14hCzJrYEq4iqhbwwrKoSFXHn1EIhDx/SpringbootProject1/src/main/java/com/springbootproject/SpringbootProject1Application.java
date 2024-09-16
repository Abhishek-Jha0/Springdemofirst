package com.springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootProject1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootProject1Application.class, args);
//	ConfigurableApplicationContext context=	SpringApplication.run(SpringbootProject1Application.class, args);
//	StudentBean s=context.getBean(StudentBean.class);
//	s.disp();
//	StudentBean s1=context.getBean(StudentBean.class);
//	s.disp();
//		System.out.println("Welcome");
	}

}