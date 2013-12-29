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
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "movie")
@Inheritance(strategy = InheritanceType.JOINED)
public class MODMovie  implements Cloneable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CodMovie;
    @Column
    private String Description;
    @Column
    private double ValueMovie;
    
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CodGender", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.PERSIST)
    private MODGender gender;
    
	public int getCodMovie() {
		return CodMovie;
	}
	public void setCodMovie(int codMovie) {
		CodMovie = codMovie;
	}
	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}
	public double getValueMovie() {
		return ValueMovie;
	}
	public void setValueMovie(double valueMovie) {
		ValueMovie = valueMovie;
	}
	public MODGender getGender() {
		return gender;
	}
	public void setGender(MODGender gender) {
		this.gender = gender;
	}

	public MODMovie() {
		this.gender = new MODGender();
	}
	
	@Override
	public MODMovie clone(){
		MODMovie objMODMovie = new MODMovie();
		try {
			objMODMovie =  (MODMovie) super.clone();
			objMODMovie.gender = gender.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objMODMovie;
	}
}
