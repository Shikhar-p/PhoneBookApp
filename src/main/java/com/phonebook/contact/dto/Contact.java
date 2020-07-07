package com.phonebook.contact.dto;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Contact {

	private Integer contactId;
	
	private String contactName;
	
	private String contactEmail;
	
	private Long contactNumber;
	
	private Date createdDate;
	
	private Date updatedDate;
	
}
