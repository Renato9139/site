
package modelos;

import javax.persistence.*;

@Entity
@Table(name = "gender")
@Inheritance(strategy = InheritanceType.JOINED)
public class MODGender  implements Cloneable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CodGender;
    @Column
    private String description;


	public int getCodGender() {
		return CodGender;
	}

	public void setCodGender(int codGender) {
		CodGender = codGender;
	}
	
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    
    public MODGender clean(){
    	return new MODGender();
    }

	@Override
	public MODGender clone(){
		MODGender objMODGender = new MODGender();
		try {
			objMODGender =  (MODGender) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objMODGender;
	}

}
