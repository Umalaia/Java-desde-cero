package modelo.dao;

import java.util.ArrayList;
import java.util.List;

import modelo.javabeans.Administrativo;
import modelo.javabeans.Alumno;
import modelo.javabeans.Persona;
import modelo.javabeans.Profesor;

public class Instituto implements InstitutoDao {
	
	private List<Persona> listaPersonas;
	
	
	public Instituto(List<Persona> listaPersonas) {
		super();
		this.listaPersonas = listaPersonas;
		cargarDatos();
	}



	public void cargarDatos() {
		listaPersonas.add(new Alumno("5632145p", "Luis", "C/Paz,3", "654896571", "1ºDAM"));
		listaPersonas.add(new Profesor("1234567k", "Pepe", "C/Pez, 2", "644525625", "Programacion"));
		listaPersonas.add(new Administrativo("5412356p", "Elena", "C/Luna, 8" , "689521412", "Personal"));
	}
	

	@Override
	public boolean altaPersona(Persona persona) {
		if (listaPersonas.contains(persona))
			return false;
			else
			return listaPersonas.add(persona);
	}

	@Override
	public Persona buscarPersona(String nif) {
		for (Persona ele: listaPersonas) {
			if (ele.getNif().equals(nif)) 
			return ele;
		} return null;
	}

	
	@Override
	public List<Persona> buscarTodas() {
		return listaPersonas;
	}

	
	@Override
	public boolean eliminarPersona(Persona persona) {
			return listaPersonas.remove(persona);
	}

	
	@Override
	public List<Persona> buscarPersonaPorTipo(String tipoPersona) {
		List<Persona> aux = new ArrayList<>();
		for (Persona ele: listaPersonas)
			if (tipoPersona.equalsIgnoreCase("Profesor") && ele instanceof Profesor) {
				aux.add(ele);
			}
			else
			if (tipoPersona.equalsIgnoreCase("Alumno") && ele instanceof Alumno) {
				aux.add(ele);	
			}
			else
			if (tipoPersona.equalsIgnoreCase("Administrativo") && ele instanceof Administrativo) {
				aux.add(ele);	
			}
		return null;
	}
	
}
