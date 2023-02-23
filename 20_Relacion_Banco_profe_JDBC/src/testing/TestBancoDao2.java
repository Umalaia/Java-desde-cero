package testing;

import modelo.dao.BancoDaoImplList;
import modelo.javabean.Oficina;

public class TestBancoDao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oficina of2 = new Oficina(9001, "madrid 17", "madrid555", "912345678");
		BancoDaoImplList mibanco = new BancoDaoImplList("MI BANCO");
		
		System.out.println(mibanco.modificarOficina(of2));
		System.out.println("nueva lista");
		for (Oficina ele: mibanco.buscarTodos()) {
			System.out.println(ele);
		} 
		
		System.out.println("UNO");
		
		System.out.println(mibanco.buscarUna(90013));

	}

}
