package bean;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("ftt.java.avancado.bean.RgValidator")
public class Validators implements Validator{
    private static final String RG_PATTERN = "^[0-9]{2}\\.[0-9]{3}\\.[0-9]{3}-[0-9]$";

	private Pattern pattern;
	private Matcher matcher;
	
	public Validators(){
		  pattern = Pattern.compile(RG_PATTERN);
	}
	
	@Override
	public void validate(FacesContext context, UIComponent component,
			Object value) throws ValidatorException {
		
		matcher = pattern.matcher(value.toString());
		if(!matcher.matches()){
			
			FacesMessage msg = 
				new FacesMessage("Falhou a validação de Rg.", 
						"Formato invalido de Rg.");
			msg.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(msg);
		}
	}
        
         
}
