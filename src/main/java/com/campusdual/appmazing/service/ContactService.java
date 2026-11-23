package com.campusdual.appmazing.service;

import com.campusdual.appmazing.api.IContactService;
import com.campusdual.appmazing.model.Contact;
import com.campusdual.appmazing.model.dao.ContactDao;
import com.campusdual.appmazing.model.dto.ContactDTO;
import com.campusdual.appmazing.model.dto.dtomapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.List;


@Service("ContactService")
@Lazy
public class ContactService implements IContactService {

    @Autowired
    private ContactDao contactDao;


    @Override
    public ContactDTO queryContact(ContactDTO contactDTO) {
        Contact contact = ContactMapper.INSTANCE.toEntity(contactDTO);
        Contact contactFounded = contactDao.getReferenceById(contact.getId());
        ContactDTO dto = ContactMapper.INSTANCE.toDTO(contactFounded);
        return dto;
    }

    @Override
    public List<ContactDTO> queryALLContacts() {
        List<Contact> allContacts = contactDao.findAll();
        List<ContactDTO> dtoList = ContactMapper.INSTANCE.toDTOList(allContacts);
        return dtoList;
    }

    @Override
    public int insertContact(ContactDTO contactDTO) {
        Contact contact = ContactMapper.INSTANCE.toEntity(contactDTO);
        contactDao.saveAndFlush(contact);
        int id = contact.getId();
        return id;
    }

    @Override
    public int updateContact(ContactDTO contactDTO) {
        return insertContact(contactDTO);
    }

    @Override
    public int deleteContact(ContactDTO contactDTO) {
        int id = contactDTO.getId();
        Contact contactToDelete = ContactMapper.INSTANCE.toEntity(contactDTO);
        contactDao.delete(contactToDelete);
        return id;
    }
}
