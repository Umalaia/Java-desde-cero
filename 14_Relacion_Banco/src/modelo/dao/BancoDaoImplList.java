package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Cliente;
import modelo.javabean.Oficina;

public class BancoDaoImplList implements BancoDao{

	private String nombre;
	private ArrayList<Oficina> listaOficinas;
	
	public BancoDaoImplList(String nombre) {
		this.nombre = nombre;
		listaOficinas = new ArrayList<>();
		cargarDatos();	
	}
	
	private void cargarDatos() {
		
		listaOficinas.add(new Oficina(9001, "madrid 1", "calle del pez, 3", "Madrid", "912745678"));
		listaOficinas.add(new Oficina(9002, "madrid 2", "calle de la flor 45", "Madrid", "912345678"));
		listaOficinas.add(new Oficina(9003, "guada 1", "calle clavel 34", "Guadalajara", "943345678"));
		listaOficinas.add(new Oficina(9004, "guada 2", "avenidade la flor 76", "Guadalajara", "943345678"));
	}

	
	@Override
	public boolean altaOficina(Oficina oficina) {
		if (listaOficinas.contains(oficina))
			return false;
		else return listaOficinas.add(oficina);
	}

	@Override
	public boolean eliminarOficina(Oficina oficina) {
		return listaOficinas.remove(oficina);
	}

	@Override
	public Oficina eliminarOficina(int posRelativa) {
		if (posRelativa >= listaOficinas.size())
			return null;
		return listaOficinas.remove(posRelativa);
	}

	@Override
	public Oficina modificarOficina(Oficina oficina) {
		int posicion = listaOficinas.indexOf(oficina);
		
		if (posicion == -1)
			return null;
		
		return listaOficinas.set(posicion, oficina);
		
	}

	@Override
	public Oficina buscarUna(int idOficina) {
		Oficina of = new Oficina();
		of.setIdOficina(idOficina);
		int posicion = listaOficinas.indexOf(of);
		
		if (posicion == -1)
			return null;
		
		return listaOficinas.get(posicion);
		
		/* PARA IR DE UNO EN UNO
		 * for (Oficina ele: listaOficinas){
		 * 	if (ele.getIdOficina() == idOficina)
		 * 		return ele;
		 * }
		 */
		
	}

	@Override
	public ArrayList<Oficina> buscarTodos() {
		return listaOficinas;
	}

	
	@Override
	public ArrayList<Oficina> buscarPorPrefijo(String prefijo) {
		ArrayList<Oficina> aux = new ArrayList<>();
		for (Oficina oficina: listaOficinas) {
				if (oficina.getTelefono().substring(0, prefijo.length()).equals(prefijo))
				aux.add(oficina);
		}
			return aux;
	}

	

	@Override
	public ArrayList<Oficina> buscarPorCiudad(String ciudad) {
		ArrayList<Oficina> aux = new ArrayList<>();
		for (Oficina oficina: listaOficinas) {
				if (oficina.getCiudad().equalsIgnoreCase(ciudad))
				aux.add(oficina);
		}
			return aux;
	}
	
	
	
	
}
