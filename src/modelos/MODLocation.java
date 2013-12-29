
package modelos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.*;


import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;


@Entity
@Table(name = "location")
@Inheritance(strategy = InheritanceType.JOINED)
public class MODLocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CodLocation;
    
    
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="CodPerson", insertable=true, updatable=true)
	@Fetch(FetchMode.JOIN)
	@Cascade(CascadeType.ALL)
    private MODCustomer customer;
	
	
    @Temporal(TemporalType.DATE)
    @Column
    private java.util.Date DateRent;
    @Temporal(TemporalType.DATE)
    @Column
    private java.util.Date DateResevation;
    @Temporal(TemporalType.DATE)
    @Column
    private java.util.Date DateDevolution;
   
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="locationitens", 
				joinColumns={@JoinColumn(name="codLocation")})
    private List<MODLocationItens> locationitens;


    public java.util.Date getDateRent() {
        return DateRent;
    }

    public void setDateRent(java.util.Date DateRent) {
        this.DateRent = DateRent;
    }

	public List<MODLocationItens> getLocationitens() {
		return locationitens;
	}

	public void setLocationitens(List<MODLocationItens> locationitens) {
		this.locationitens = locationitens;
	}

	public java.util.Date getDateResevation() {
        return DateResevation;
    }

    public void setDateResevation(java.util.Date DateResevation) {
        this.DateResevation = DateResevation;
    }

    public java.util.Date getDateDevolution() {
        return DateDevolution;
    }

    public void setDateDevolution(java.util.Date DateDevolution) {
        this.DateDevolution = DateDevolution;
    }

    public int getCodLocation() {
		return CodLocation;
	}

    public void setCodLocation(int codLocation) {
		CodLocation = codLocation;
	}

    public MODCustomer getCustomer() {
		return customer;
	}

    public void setCustomer(MODCustomer customer) {
		this.customer = customer;
	}

	public MODLocation() {
		this.customer = new MODCustomer();
		this.locationitens = new ArrayList();
	}

   
    
}
