
package modelos;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@PrimaryKeyJoinColumn(name = "CodPerson")
public class MODCustomer extends MODPerson {
    
    @Column
    private String Address;
    @Column
    private double PhoneNumber;
    @Column
    private String Cpf;
    @Column
    private String Identit;
  

    public String getAddress() {
        return Address;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }

    public double getPhoneNumber() {
        return PhoneNumber;
    }
    public void setPhoneNumber(double PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String CPF) {
        this.Cpf = CPF;
    }

    public String getIdentit() {
        return Identit;
    }
    public void setIdentit(String Identity) {
        this.Identit = Identity;
    }

    public MODCustomer(int CodPerson, String Name, String Address, double PhoneNumber, String Cpf, String Identity) {
        setCodPerson(CodPerson);
        setName(Name);
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
        this.Cpf = Cpf;
        this.Identit = Identit;
    }
    
    public MODCustomer(){
        
    }
    
}
