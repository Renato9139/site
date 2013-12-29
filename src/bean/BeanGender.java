package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelos.*;

import dao.DAOGender;
import dao.DAOGender;
import dao.DAOMedia;
import dao.DAOMovie;




@ManagedBean(name="BeanGender")
@SessionScoped
public class BeanGender {

    private MODGender gender;
    private DAOGender objDAOGender;

    public BeanGender() {
        this.gender = new MODGender();
        this.objDAOGender = new DAOGender();
    }
    

    public String insertnew() {
    	this.gender = new MODGender();
        return "insert";
    }
    
    public String insert() {
        try {
            
            if (this.gender.getCodGender() > 0){
                objDAOGender.update(this.gender);
            }            
            else
            {
                objDAOGender.save(this.gender);
            }
            
            
        } catch (Exception ex) {
            System.console().writer().println(ex.getMessage());
        }

        return "index";
    }

    public void setGender(MODGender gender) {
        this.gender = gender;
    }

    public MODGender getGender() {
        return gender;
    }


    public List<MODGender> getListGender() {

        return  this.objDAOGender.list();
    }
}
