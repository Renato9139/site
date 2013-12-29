package modelos;

public class MODStatus {
    
	
    private int CodStatus;
    private String description;

    public int getCodStatus() {
        return CodStatus;
    }

    public MODStatus(int codStatus, String description) {
		super();
		CodStatus = codStatus;
		this.description = description;
	}

	public MODStatus() {
		// TODO Auto-generated constructor stub
	}

	public void setCodStatus(int CodStatus) {
        this.CodStatus = CodStatus;
    }

    public String getDescription() {
    	switch (this.CodStatus){
    	case 1:
    		return "Disponível";
		case 2:
    		return"Danificado";
    	case 3:
    		return "Faltando";
   		default:
   			return this.description;
    	}
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
