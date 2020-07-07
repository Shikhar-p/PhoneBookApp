package com.phonebook.contact.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.phonebook.contact.dto.Contact;
import com.phonebook.contact.service.ContactService;

@Controller
@RequestMapping("/phonebook")
public class ContactInfoController {
	
	@Autowired
	private ContactService contactService;
	
	@GetMapping("/addcontact")
	public String loadForm(Model model){
		Contact c = new Contact();
		model.addAttribute("contact", c);
		return "contactInfo";
	}
	
	@PostMapping("/saveContact")
	public String handleSubmitBtn(@ModelAttribute ("contact")Contact c, Model model){
		boolean isSaved = contactService.saveContact(c);
		if(isSaved){
			model.addAttribute("succMsg", "contact saved.."); // its bad programming practice
		}else{
			model.addAttribute("errMsg", "Failed to save Contact");
		}
		return "contactInfo";
	}
	
	
	public String handleViewContactsLink(Model model){
		List<Contact> contactList = contactService.getAllContacts();
		
		model.addAttribute("contacts", contactList);
		return "viewContacts";
	}
	

}
