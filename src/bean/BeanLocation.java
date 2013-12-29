package bean;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelos.*;

import dao.*;




@ManagedBean(name="BeanLocation")
@SessionScoped
public class BeanLocation {

    private MODLocation location;
    private DAOLocation objDAOLocation;
    private DAOLocationItens objDAOLocationItens;
    private DAOCustomer objDAOCustomer;
    private DAOMedia objDAOMedia;
    
    private MODLocationItens locationiten;
    

    public MODLocationItens getLocationiten() {
		return locationiten;
	}

	public void setLocationiten(MODLocationItens locationiten) {
		this.locationiten = locationiten;
	}

	public BeanLocation() {
        this.location = new MODLocation();
        this.locationiten = new MODLocationItens();
        
        this.objDAOLocation = new DAOLocation();
        this.objDAOLocationItens = new DAOLocationItens();
        this.objDAOCustomer = new DAOCustomer();
        this.objDAOMedia = new DAOMedia();
    }

    
    public String insertnew() {
    	this.location = new MODLocation();
        return "insert";
    }
    
    public String insertlocationiten() {
    	this.location.setCustomer(objDAOCustomer.get(this.location.getCustomer().getCodPerson()));
    	this.locationiten.setMedia(objDAOMedia.get(this.locationiten.getMedia().getCodMedia()));
    	
    	
    	//List<MODLocationItens> locallocationitens = new ArrayList();
    	//if (this.location.getLocationitens() != null){
    	//	locallocationitens = this.location.getLocationitens();
    	//}
    	//locallocationitens.add(this.locationiten);

    	this.location.getLocationitens().add(this.locationiten.clone());
    	
        return "index";
    }
    
    public String insert() {
        try {

        	this.location.setDateRent(new Date(System.currentTimeMillis()));
        	this.location.setDateResevation(new Date(System.currentTimeMillis()));
        	
        	//for (MODLocationItens objItem : this.location.getLocationitens()){
        	//	objDAOLocationItens.save(objItem);
        	//}
        	
               objDAOLocation.save(this.location);
           
            
        } catch (Exception ex) {
            System.console().writer().println(ex.getMessage());
        }

        return "index";
    }
    
    
    public String clean() {
        this.location = new MODLocation();
        this.locationiten = new MODLocationItens();
        
        return "index";
    }

    public void setLocation(MODLocation location) {
        this.location = location;
    }

    public MODLocation getLocation() {
        return location;
    }


    public List<MODLocation> getListLocation() {

        return  this.objDAOLocation.list();
    }
}
