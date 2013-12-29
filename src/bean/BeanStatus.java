package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelos.*;

import dao.DAOStatus;
import dao.DAOStatus;
import dao.DAOMedia;
import dao.DAOMovie;




@ManagedBean(name="BeanStatus")
@SessionScoped
public class BeanStatus {

    private MODStatus status;
    private DAOStatus objDAOStatus;

    public BeanStatus() {
        this.status = new MODStatus();
        this.objDAOStatus = new DAOStatus();
    }

    public void setStatus(MODStatus status) {
        this.status = status;
    }

    public MODStatus getStatus() {
        return status;
    }


    public List<MODStatus> getListStatus() {

        return  this.objDAOStatus.list();
    }
}
