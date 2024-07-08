package es.davidrico.springboot.form.editors;

import java.beans.PropertyEditorSupport;

import es.davidrico.springboot.form.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RolesEditor extends PropertyEditorSupport{

	@Autowired
	private RoleService service;
	
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		try {
			
			Integer id = Integer.parseInt(text);
			setValue(service.obtenerPorId(id));
			
		} catch(NumberFormatException e){
			
			setValue(null);
		}
	}
}
