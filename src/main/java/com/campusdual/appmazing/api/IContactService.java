package com.campusdual.appmazing.api;

import com.campusdual.appmazing.model.dto.ContactDTO;

import java.util.List;

public interface IContactService {

    //CRUD

    ContactDTO queryContact(ContactDTO contactDTO);
    List<ContactDTO> queryALLContacts();
    int insertContact(ContactDTO contactDTO);
    int updateContact(ContactDTO contactDTO);
    int deleteContact(ContactDTO contactDTO);
}
