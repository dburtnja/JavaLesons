package denys.first.first_first.dao.hibernate;

import denys.first.first_first.dao.Dao;
import denys.first.first_first.entity.Book;
import denys.first.first_first.entity.Persistent;
import org.hibernate.Query;

import java.util.List;

public class BookHibernateDao extends AbstractHibernateDao<Book>{

    public void saveOrUpdate(Book persistent) {
        getCurrentSession().save(persistent);
    }

    public void delete(Long id) {
        Query   query;

        query = getCurrentSession().createQuery("delete Book where id= :bookId");
        query.setLong("bookId", id);
        query.executeUpdate();
    }

    public void delete(Book persistent) {
        getCurrentSession().delete(persistent);
    }

    public Book get(Long id) {
        return (Book) getCurrentSession().load(Book.class, id);
    }

    @SuppressWarnings({"unchecked"})
    public List<Book> getAll() {
        return getCurrentSession().createQuery("from Book").list();
    }
}
