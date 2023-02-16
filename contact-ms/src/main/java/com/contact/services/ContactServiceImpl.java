package com.contact.services;

import com.contact.model.Contact;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ContactServiceImpl implements ContactService{
    List<Contact> list = Arrays.asList(
            new Contact(1L,"amogh@gmail.com","Amogh",1313L),
            new Contact(2L,"sarvagya@gmail.com","Sarvagya",1311L),
            new Contact(3L,"ansh@gmail.com","Ansh",1311L),
            new Contact(4L,"anil@gmail.com","Anil",1312L)
    );
    @Override
    public List<Contact> getAllContacts(Long userId) {
        return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
