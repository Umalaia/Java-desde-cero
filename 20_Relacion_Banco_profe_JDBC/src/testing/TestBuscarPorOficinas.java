package testing;

import modelo.dao.BancoDaoImplList;
import modelo.javabean.Oficina;

public class TestBuscarPorOficinas {

	public static void main(String[] args) {
		BancoDaoImplList banco = new BancoDaoImplList("BANCO");
		
		String ciudad = "MADRID";
		String prefijo = "9127";
		System.out.println("Listar oficinas por ciudad");
		for (Oficina oficina: banco.buscarPorCiudad(ciudad)) {
			System.out.println(oficina);
		}
		
		System.out.println("Listar oficinas por prefijo telefonica");
		for (Oficina oficina: banco.buscarPorPrefijo(prefijo)) {
			System.out.println(oficina);
		}
		
		System.out.println("Fin de programa");

	}

}
