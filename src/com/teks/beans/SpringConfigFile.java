package com.teks.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Address createAddress() {
		
		Address addr = new Address();
		
		addr.setCity("Hyderabad");
		addr.setHousno("22-7");
		addr.setPincode(500014);
		
		return addr;
		
	}
	
	@Bean
	public Student createStdObj() {
		Student std = new Student();
		
		std.setId(112);
		std.setName("Taruni");
		std.setEmail("taruni@gmail.com");
//		std.setAddress(createAddress());//manual setter dependency injection where we manually connect address function to student function
//		
		return std;
	}
	
	
	
}
