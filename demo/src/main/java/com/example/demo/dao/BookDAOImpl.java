package com.example.demo.dao;

import com.example.demo.model.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO{
    private static final Logger logger = LoggerFactory.getLogger(BookDAOImpl.class);

    private SessionFactory      sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    private Session getSession(){
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public void addBook(Book book) {
        getSession().persist(book);
        logger.info("Book successfully added. Book details: " + book);
    }

    @Override
    public void updateBook(Book book) {
        getSession().update(book);
        logger.info("Book successfully update. Book details " + book);
    }

    @Override
    public void removeBook(int id) {
        Book    book;
        Session session;

        session = getSession();
        book = (Book) session.load(Book.class, id);
        if (book != null) {
            session.delete(book);
            logger.info("Book successfully removed. Book info: " + book);
        }
        logger.info("Could not find book whit id = " + id);
    }

    @Override
    public Book getBookById(int id) {
        Book    book;

        book = (Book) getSession().load(Book.class, id);
        if (book != null)
            logger.info("Book successfully loaded. Book info: " + book);
        else
            logger.info("Couldn't find book by id = " + id);
        return book;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Book> listBooks() {
        List<Book>  books;

        books = getSession().createQuery("from Book").list();
        for (Book book : books){
            logger.info("Books: " + book);
        }
        return books;
    }
}
