package com.teks.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.teks.beans.SpringConfigFile;
import com.teks.beans.Student;

public class main {

	public static void main(String[] args) {
		
		String config = "/com/teks/resource/applicationContext.xml";
		
//		ApplicationContext context = new ClassPathXmlApplicationContext(config);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
		
		Student std = (Student) context.getBean(Student.class);
		
		std.display();
	}

}


//JAR FILES TO BE DOWNLOADED FOR THE SPRING BOOT
//1.spring-bean 
//2. spring-core
//3.spring-context
//4.common-logging
//5.spring-exression
//6.Spring AOP
