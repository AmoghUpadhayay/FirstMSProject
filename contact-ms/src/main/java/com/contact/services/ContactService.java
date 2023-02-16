package com.contact.services;

import com.contact.model.Contact;

import java.util.List;

public interface ContactService {
    public List<Contact> getAllContacts(Long userId);
}
