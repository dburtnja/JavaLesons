package ua.denys.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import ua.denys.domain.Contact;

import java.util.List;

@Repository
public class ContactDAOimpl implements ContactDAO{

    @Autowired
    private SessionFactory  sessionFactory;

    @Override
    public void addContact(Contact contact) {
        sessionFactory.getCurrentSession().save(contact);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Contact> listContact() {
        return sessionFactory.getCurrentSession().
                createQuery("from Contact").list();
    }

    @Override
    public void removeContact(Integer id) {
        Contact contact;

        contact = (Contact) sessionFactory.getCurrentSession().
                load(Contact.class, id);
        if (contact != null)
            sessionFactory.getCurrentSession().delete(contact);
    }
}
