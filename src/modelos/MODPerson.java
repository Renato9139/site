package modelos;

import javax.persistence.*;

@Entity
@Table(name = "person")
@Inheritance(strategy = InheritanceType.JOINED)
public class MODPerson {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int CodPerson;
    
    @Column
    private String Name;

    public int getCodPerson() {
        return CodPerson;
    }

    public void setCodPerson(int CodPerson) {
        this.CodPerson = CodPerson;
    }

    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    
}
