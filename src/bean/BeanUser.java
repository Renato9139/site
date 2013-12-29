package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelos.*;

import dao.DAOUser;
import dao.DAOUser;
import dao.DAOMedia;
import dao.DAOMovie;




@ManagedBean(name="BeanUser")
@SessionScoped
public class BeanUser {

    private MODUser user;
    private DAOUser objDAOUser;

    public BeanUser() {
        this.user = new MODUser();
        this.objDAOUser = new DAOUser();
    }
    

    public String insertnew() {
    	this.user = new MODUser();
        return "insert";
    }
    
    public String insert() {
        try {
            
            if (this.user.getCodUser() > 0){
                objDAOUser.update(this.user);
            }            
            else
            {
                objDAOUser.save(this.user);
            }
            
            
        } catch (Exception ex) {
            System.console().writer().println(ex.getMessage());
        }

        return "index";
    }

    public void setUser(MODUser user) {
        this.user = user;
    }

    public MODUser getUser() {
        return user;
    }


    public List<MODUser> getListUser() {

        return  this.objDAOUser.list();
    }
}
