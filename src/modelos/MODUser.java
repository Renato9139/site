
package modelos;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class MODUser  implements Cloneable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CodUser;
    @Column
    private String password;


	public int getCodUser() {
		return CodUser;
	}

	public void setCodUser(int codUser) {
		CodUser = codUser;
	}
	
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public MODUser clean(){
    	return new MODUser();
    }

	@Override
	public MODUser clone(){
		MODUser objMODUser = new MODUser();
		try {
			objMODUser =  (MODUser) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return objMODUser;
	}

}
