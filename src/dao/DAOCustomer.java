package dao;

import java.util.List;

import modelos.*;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import utils.HibernateUtil;


public class DAOCustomer  {

    public void save(MODCustomer customer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.save(customer);
        t.commit();
    }

    public MODCustomer get(int id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(MODCustomer.class);  
        criteria.add(Restrictions.eq("CodPerson", id));
        List result = criteria.list(); 

        return (MODCustomer) result.get(0);
    }

    public List<MODCustomer> list() {
        
        Session session = HibernateUtil.getSessionFactory().openSession();
        Criteria criteria = session.createCriteria(MODCustomer.class);  
        List result = criteria.list(); 

        return result;
    }

    public void remove(MODCustomer customer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.delete(customer);
        t.commit();
    }

    public void update(MODCustomer customer) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction t = session.beginTransaction();
        session.update(customer);
        t.commit();
    }
}