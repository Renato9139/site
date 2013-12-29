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
public class DAOLocation {
    
    public void save(MODLocation location) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(location);
        t.commit();
    }

    public MODLocation get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (MODLocation) session.load(MODLocation.class, id);
    }

    public List<MODLocation> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(MODLocation.class);  
        List result = criteria.list(); 

        return result;
    }

    public void remove(MODLocation location) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(location);
        t.commit();
    }

    public void update(MODLocation location) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(location);
        t.commit();
    }
}
