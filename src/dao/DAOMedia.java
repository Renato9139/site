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
import org.hibernate.criterion.Restrictions;

import utils.HibernateUtil;

/**
 *
 * @author 031115215
 */
public class DAOMedia {
    
    public void save(MODMedia Media) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(Media);
        t.commit();
    }

    public MODMedia get(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(MODMedia.class);  
        criteria.add(Restrictions.eq("CodMedia", id));
        List result = criteria.list(); 

        return (MODMedia) result.get(0);
    }

    public List<MODMedia> list() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(MODMedia.class);  
        List result = criteria.list(); 

        return result;
    }

    public void remove(MODMedia Media) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(Media);
        t.commit();
    }

    public void update(MODMedia Media) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(Media);
        t.commit();
    }
}
