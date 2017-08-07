package denys.first.first_first.dao.hibernate;

import denys.first.first_first.dao.Dao;
import denys.first.first_first.entity.Author;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

import java.util.List;

public class AuthorHibernateDao extends AbstractHibernateDao<Author> {

    public void saveOrUpdate(Author persistent) {
        getCurrentSession().save(persistent);
    }

    public void delete(Long id) {
        Query   query;

        query = getCurrentSession().createQuery("delete Author where id= :authorId");
        query.setLong("authorId", id);
        query.executeUpdate();
    }

    public void delete(Author persistent) {
        getCurrentSession().delete(persistent);
    }

    public Author get(Long id) {
        return (Author) getCurrentSession().load(Author.class, id);
    }

    @SuppressWarnings("unchecked")
    public List<Author> getAll() {
        return getCurrentSession().createQuery("from Author ").list();
    }


}
