/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import java.util.Set;
import javax.persistence.*;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name = "locationitens")
@Inheritance(strategy = InheritanceType.JOINED)
public class MODLocationItens implements Cloneable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CodLocationItem;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="CodMedia", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.PERSIST)
    private MODMedia media;
	
	@Column
	private double ValueMedia;


	public int getCodLocationItem() {
		return CodLocationItem;
	}

	public void setCodLocationItem(int codLocationItem) {
		CodLocationItem = codLocationItem;
	}

	public double getValueMedia() {
		return ValueMedia;
	}

	public void setValueMedia(double valueMedia) {
		ValueMedia = valueMedia;
	}

	public MODMedia getMedia() {
		return media;
	}

	public void setMedia(MODMedia media) {
		this.media = media;
	}

	public MODLocationItens() {
		this.media = new MODMedia();
	}

	public MODLocationItens(int codLocationItem, MODMedia media,
			double valueMedia) {
		super();
		CodLocationItem = codLocationItem;
		this.media = media;
		ValueMedia = valueMedia;
	}


	@Override
	public MODLocationItens clone(){
		MODLocationItens objMODLocationItens = new MODLocationItens();
		try {
			objMODLocationItens =  (MODLocationItens) super.clone();
			objMODLocationItens.media = this.media.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objMODLocationItens;
	}
	
	
	
}
