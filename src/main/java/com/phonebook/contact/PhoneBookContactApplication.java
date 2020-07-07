package com.phonebook.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@ComponentScan("com.phonebook.contact")
public class PhoneBookContactApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhoneBookContactApplication.class, args);
	}

}
