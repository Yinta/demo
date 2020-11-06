package com.example.demo;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bean.Resource;
import com.example.bean.Student;
@ComponentScan(basePackages = "com.example.bean")
@RestController
public class HelloControl {
	@Autowired
	Resource resource;
	@RequestMapping("/hello")
public String name() {
	return "hello world!!";
}
	@RequestMapping("/nihao")
	public Student name1() {
		Student student=new Student();
		student.setName("name");
		student.setDate(new Date());
		student.setAddress("address地址");
		student.setAge(10);
		return student;
	}
	@RequestMapping("/resource")
	public Resource name2() {
		System.out.println(resource);
		return resource;
	}
}
