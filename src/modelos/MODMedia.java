/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "media")
@Inheritance(strategy = InheritanceType.JOINED)
public class MODMedia  implements Cloneable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CodMedia;
       
    
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CodMovie", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.PERSIST)
    private MODMovie movie;
	
	@Column
	private int CodStatus;
	
	

	
	
    

    public int getCodMedia() {
        return CodMedia;
    }


    public void setCodMedia(int CodMedia) {
        this.CodMedia = CodMedia;
    }


    public MODMovie getMovie() {
        return movie;
    }

    public void setMovie(MODMovie movie) {
        this.movie = movie;
    }


	public MODStatus getStatus() {
	    MODStatus status;
	    
    	switch (this.getCodStatus()){
    	case 1:
    		status = new MODStatus(1, "Disponível");
    		break;
		case 2:
			status = new MODStatus(2, "Danificado");
			break;
    	case 3:
    		status = new MODStatus(3, "Faltando");
    		break;
    	default:
    		status = new MODStatus(1, "Disponível");
    		break;
    	}
    	return status;
	}


	public void setStatus(MODStatus status) {
		this.setCodStatus(status.getCodStatus());
		status = status;
	}


	public MODMedia() {
		this.movie = new MODMovie();
	}


	public int getCodStatus() {
		return CodStatus;
	}


	public void setCodStatus(int codStatus) {
		CodStatus = codStatus;
	}


	public MODMedia(int codMedia, MODMovie movie, int codStatus) {
		super();
		CodMedia = codMedia;
		this.movie = movie;
		CodStatus = codStatus;
	}
	
	@Override
	public MODMedia clone(){
		MODMedia objMODMedia = new MODMedia();
		try {
			objMODMedia =  (MODMedia) super.clone();
			objMODMedia.movie = movie.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objMODMedia;
	}
	
	
}
