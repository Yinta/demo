package com.example.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component 
@ConfigurationProperties(prefix ="com.resource" )
@PropertySource(value = "classpath:resource.properties")
public class Resource {
String name;
String website;
@Override
public String toString() {
	return "Resource [name=" + name + ", website=" + website + ", language=" + language + "]";
}
String language;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getWebsite() {
	return website;
}
public void setWebsite(String website) {
	this.website = website;
}
public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}
}
