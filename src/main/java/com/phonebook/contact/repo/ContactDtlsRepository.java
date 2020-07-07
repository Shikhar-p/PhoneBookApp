package com.phonebook.contact.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phonebook.contact.entity.ContactEntity;

public interface ContactDtlsRepository extends JpaRepository<ContactEntity, Integer> {

}
