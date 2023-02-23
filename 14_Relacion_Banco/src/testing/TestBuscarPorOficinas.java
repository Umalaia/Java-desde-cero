package testing;

import modelo.dao.BancoDaoImplList;
import modelo.javabean.Oficina;

public class TestBuscarPorOficinas {

	public static void main(String[] args) {
		BancoDaoImplList banco = new BancoDaoImplList("Banco");
		
		String ciudad = "Madrid";
		System.out.println("Listar oficinas por ciudad");
		for (Oficina oficina: banco.buscarPorCiudad(ciudad)){
				System.out.println(oficina);
		}
	
		
		System.out.println("Listar oficinas por prefijo");
		for (Oficina oficina: banco.buscarPorPrefijo("9127")) {
			System.out.println(oficina);
	}
	
	

}
}
