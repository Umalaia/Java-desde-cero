package testingJDBC;

import modelo.dao.OficinaDao;
import modelo.dao.OficinaDaoImplMy8;
import modelo.javabean.Oficina;

public class TestConexion {

	public static void main(String[] args) {
		OficinaDao odao = new OficinaDaoImplMy8();
		Oficina of = odao.buscarUna(9001);
		if (of != null)		
			System.out.println(of.getNombre());
		else
			System.out.println("Oficina nooo encontrada");
		
		// test dar de alta una oficina no existente
		//Oficina of2 = new Oficina(9005, "Sevilla2", "nuez 65","sevilla", "678900543");
		//System.out.println(odao.altaOficina(of2));
		
		//test borrar oficina
		//System.out.println(odao.eliminarOficina(9005));
		
		// test dar de alta una oficina existente
		//Oficina of3 = new Oficina(9003, "Sevilla2", "nuez 65","sevilla", "678900543");
		
		//modificar oficina
		//of.setCiudad("cordoba");
		//System.out.println(odao.modificarOficina(of));
		
		
		System.out.println("BUSCAR TODOS");
		for (Oficina ele: odao.buscarTodos())
			System.out.println(ele);
		
		System.out.println("BUSCAR prefijo");
		for (Oficina ele: odao.buscarPorPrefijo("644"))
			System.out.println(ele);
		
		System.out.println("BUSCAR por ciudad -> madrid");
		for (Oficina ele: odao.buscarPorCiudad("madrid"))
			System.out.println(ele);
		
		/*
		 * System.out.println("BUSCAR por ciudad -> sevilla");
		for (Oficina ele: odao.buscarPorCiudad("sevilla"))
			System.out.println(ele);
		 */
	
		

	}

}
