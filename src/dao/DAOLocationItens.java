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
public class DAOLocationItens {
    
     public void save(MODLocationItens locationItens) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(locationItens);
        t.commit();
    }

    public MODLocationItens get(long id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        return (MODLocationItens) session.load(MODLocationItens.class, id);
    }

    public List<MODLocationItens> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(MODLocationItens.class);  
        List result = criteria.list(); 

        return result;
    }

    public void remove(MODLocationItens locationItens) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(locationItens);
        t.commit();
    }

    public void update(MODLocationItens locationItens) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(locationItens);
        t.commit();
    }
}
