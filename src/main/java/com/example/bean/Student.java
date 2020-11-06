package com.example.bean;

import java.util.Date;

import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@Configuration
public class Student {
int age;
@JsonIgnore
String name;
String address;
@JsonFormat(pattern = "yyyy-MM-dd hh-mm-ss a",locale = "zh",timezone = "GMT+8")
Date date;
@JsonInclude(Include.NON_NULL)
String id;
public Date getDate() {
	return date;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public void setDate(Date date) {
	this.date = date;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
