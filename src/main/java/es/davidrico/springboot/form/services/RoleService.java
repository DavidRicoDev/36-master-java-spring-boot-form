package es.davidrico.springboot.form.services;

import java.util.List;

import es.davidrico.springboot.form.models.domain.Role;

public interface RoleService {
	
	public List<Role> listar();
	
	public Role obtenerPorId(Integer id);

}
