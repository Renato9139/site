package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import modelos.*;

import dao.DAOMovie;
import dao.DAOMovie;
import dao.DAOMedia;
import dao.DAOMovie;




@ManagedBean(name="BeanMovie")
@SessionScoped
public class BeanMovie {

    private MODMovie movie;
    private DAOMovie objDAOMovie;

    public BeanMovie() {
        this.movie = new MODMovie();
        
        this.objDAOMovie = new DAOMovie();
    }

    public String insertnew() {
    	this.movie = new MODMovie();
        return "insert";
    }
    
    public String insert() {
        try {

            if (this.movie.getCodMovie() > 0){
                objDAOMovie.update(this.movie);
            }            
            else
            {
                objDAOMovie.save(this.movie);
            }
            
            
        } catch (Exception ex) {
            System.console().writer().println(ex.getMessage());
        }

        return "index";
    }

    public void setMovie(MODMovie movie) {
        this.movie = movie;
    }

    public MODMovie getMovie() {
        return movie;
    }


    public List<MODMovie> getListMovie() {

        return  this.objDAOMovie.list();
    }
}
