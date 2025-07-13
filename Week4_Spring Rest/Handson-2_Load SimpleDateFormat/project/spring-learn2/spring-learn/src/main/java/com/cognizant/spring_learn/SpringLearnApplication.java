package com.cognizant.spring_learn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringLearnApplication {
	 private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);
	public static void main(String[] args) {
	    LOGGER.info("START");
	    SpringApplication.run(SpringLearnApplication.class, args);
	    displayDate();
	    LOGGER.info("END");
	}

	
	public static void displayDate() {
	    ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");
	    SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

	    try {
	        Date date = format.parse("31/12/2018");
	        System.out.println("Parsed Date: " + date);
	    } catch (ParseException e) {
	        e.printStackTrace();
	    }

	    ((ClassPathXmlApplicationContext) context).close();
	}


}
