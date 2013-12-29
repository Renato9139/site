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
public class DAOOperator {
    
     public void save(MODOperator operator) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(operator);
        t.commit();
    }

    public MODOperator get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (MODOperator) session.load(MODOperator.class, id);
    }

    public List<MODOperator> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(MODOperator.class);  
        List result = criteria.list(); 

        return result;
    }

    public void remove(MODOperator operator) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(operator);
        t.commit();
    }

    public void update(MODOperator operator) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(operator);
        t.commit();
    }
}
