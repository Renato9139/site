/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

import modelos.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import utils.HibernateUtil;

/**
 *
 * @author 031115215
 */
public class DAOMovie {
    
    public void save(MODMovie Movie) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(Movie);
        t.commit();
    }

    public MODMovie get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (MODMovie) session.load(MODMovie.class, id);
    }

    public List<MODMovie> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(MODMovie.class);  
        List result = criteria.list(); 

        return result;
    }

    public void remove(MODMovie Movie) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(Movie);
        t.commit();
    }

    public void update(MODMovie Movie) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(Movie);
        t.commit();
    }
}
