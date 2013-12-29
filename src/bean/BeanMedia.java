package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelos.*;

import dao.DAOMedia;
import dao.DAOMedia;
import dao.DAOMedia;
import dao.DAOMedia;




@ManagedBean(name="BeanMedia")
@SessionScoped
public class BeanMedia {

    private MODMedia media;
    private DAOMedia objDAOMedia;

    public BeanMedia() {
        this.media = new MODMedia();
        
        this.objDAOMedia = new DAOMedia();
    }

    
    public String insertnew() {
    	this.media = new MODMedia();
        return "insert";
    }
    
    public String insert() {
        try {

            if (this.media.getCodMedia() > 0){
                objDAOMedia.update(this.media);
            }            
            else
            {
                objDAOMedia.save(this.media);
            }
            
            
        } catch (Exception ex) {
            System.console().writer().println(ex.getMessage());
        }

        return "index";
    }

    public void setMedia(MODMedia media) {
        this.media = media;
    }

    public MODMedia getMedia() {
        return media;
    }


    public List<MODMedia> getListMedia() {

        return  this.objDAOMedia.list();
    }
}
