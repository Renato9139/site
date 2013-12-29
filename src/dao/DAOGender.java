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
public class DAOGender {
    
    public void save(MODGender gender) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(gender);
        t.commit();
    }

    public MODGender get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (MODGender) session.load(MODCustomer.class, id);
    }

    public List<MODGender> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(MODGender.class);  
        List result = criteria.list(); 

        return result;
    }

    public void remove(MODGender gender) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(gender);
        t.commit();
    }

    public void update(MODGender gender) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(gender);
        t.commit();
    }
}
