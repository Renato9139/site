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

public class DAOUser {
    
    public void save(MODUser user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(user);
        t.commit();
    }

    public MODUser get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (MODUser) session.load(MODCustomer.class, id);
    }

    public List<MODUser> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(MODUser.class);  
        List result = criteria.list(); 

        return result;
    }

    public void remove(MODUser user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(user);
        t.commit();
    }

    public void update(MODUser user) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(user);
        t.commit();
    }
}
