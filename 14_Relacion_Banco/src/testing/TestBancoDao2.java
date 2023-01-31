package testing;

import modelo.dao.BancoDaoImplList;
import modelo.javabean.Oficina;

public class TestBancoDao2 {

	public static void main(String[] args) {
		
		BancoDaoImplList miBanco = new BancoDaoImplList("MI BANCO");
		Oficina of2 = new Oficina(9001, "madrid 17", "madrid555", "Madrid","912345678");
		
		System.out.println(miBanco.modificarOficina(of2));
		System.out.println("nueva lista :");
		for(Oficina ele: miBanco.buscarTodos()) {
			System.out.println(ele);
		}
		
		System.out.println("UNO");
		
		System.out.println(miBanco.buscarUna(9003));
		System.out.println(miBanco.buscarUna(9013));
	}

}
