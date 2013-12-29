package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelos.*;

import dao.DAOCustomer;
import dao.DAOGender;
import dao.DAOMedia;
import dao.DAOMovie;




@ManagedBean(name="BeanCustomer")
@SessionScoped
public class BeanCustomer {

    private MODCustomer customer;
    private DAOCustomer objDAOCustomer;

    public BeanCustomer() {
        this.customer = new MODCustomer();
        this.objDAOCustomer = new DAOCustomer();
    }

    
    public String insertnew(){
    	this.customer = new MODCustomer();
    	return "insert";
    }
    
    
    public String insert() {
        try {
            
            if (this.customer.getCodPerson() > 0){
                objDAOCustomer.update(this.customer);
            }            
            else
            {
                objDAOCustomer.save(this.customer);
            }
        } catch (Exception ex) {
            System.console().writer().println(ex.getMessage());
        }

        return "index";
    }

    public void setCustomer(MODCustomer customer) {
        this.customer = customer;
    }

    public MODCustomer getCustomer() {
        return customer;
    }


    public List<MODCustomer> getListCustomer() {

        return  this.objDAOCustomer.list();
    }
}
