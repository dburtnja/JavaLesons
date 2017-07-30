package ua.denys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.denys.dao.ContactDAO;
import ua.denys.domain.Contact;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    private ContactDAO  contactDAO;

    @Transactional
    @Override
    public void addContact(Contact contact) {
        contactDAO.addContact(contact);
    }

    @Transactional
    @Override
    public List<Contact> listContact() {
        return contactDAO.listContact();
    }

    @Transactional
    @Override
    public void removeContact(Integer id) {
        contactDAO.removeContact(id);
    }
}
