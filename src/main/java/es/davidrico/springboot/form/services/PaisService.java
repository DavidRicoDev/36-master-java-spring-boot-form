package es.davidrico.springboot.form.services;

import java.util.List;

import es.davidrico.springboot.form.models.domain.Pais;

public interface PaisService {
	
	public List<Pais> listar();
	
	public Pais obtenerPorId(Integer id);

}
