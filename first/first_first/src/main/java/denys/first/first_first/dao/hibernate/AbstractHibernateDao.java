package denys.first.first_first.dao.hibernate;

import denys.first.first_first.dao.Dao;
import denys.first.first_first.entity.Author;
import denys.first.first_first.entity.Persistent;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;

public abstract class AbstractHibernateDao<T extends Persistent> implements Dao<T> {
    private SessionFactory sessionFactory;

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
