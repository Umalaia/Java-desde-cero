package testing;

import modelo.dao.BancoDaoImplList;
import modelo.javabean.Oficina;

public class TestBanco {

	public static void main(String[] args) {
		//creamos el banco
		BancoDaoImplList miBanco = new BancoDaoImplList("MI BANCO");
		
		System.out.println("BUSCAR TODOS");
		
		for(Oficina ele: miBanco.buscarTodos()) {
			System.out.println(ele);
		}
		
		System.out.println("ALTA OFICINA");
		
		Oficina of1 = new Oficina(9005, "barcelona 1", "barcelona", "Barcelona", "93412457");
		Oficina of2 = new Oficina(9001, "madrid 17", "madrid555", "Madrid", "912345678");
		
		System.out.println(miBanco.altaOficina(of1));
		System.out.println(miBanco.altaOficina(of2));
		
		
		System.out.println("eliminar OFICINA por objeto");	
		System.out.println("eliminando 9005 me tiene que dar true : " + miBanco.eliminarOficina(of1));
		
		System.out.println(miBanco.eliminarOficina(10));
		System.out.println(miBanco.eliminarOficina(0));
		System.out.println("la lista nueva es : ");
		
		for(Oficina ele: miBanco.buscarTodos()) {
			System.out.println(ele);
		}
		

		
	}

}
