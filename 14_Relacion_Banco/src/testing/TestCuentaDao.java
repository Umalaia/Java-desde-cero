package testing;

import modelo.dao.ClienteDaoImplList;
import modelo.dao.CuentaDaoImplList;
import modelo.javabean.Cliente;
import modelo.javabean.Cuenta;

public class TestCuentaDao {

	public static void main(String[] args) {
		CuentaDaoImplList cudao = new CuentaDaoImplList();
		
		System.out.println("Listar todos");
		for (Cuenta ele: cudao.buscarTodos())
			System.out.println(ele);
		
		
		System.out.println("Listar por cliente");
	 	String idCliente = "3333A";
		for (Cuenta ele: cudao.buscarPorClientes(idCliente))
			System.out.println(ele);
		
		System.out.println("Listar una");
		Cuenta cuenta = cudao.buscarUno(2000) ;
		System.out.println(cuenta);
		System.out.println("Ciudad de oficina : " + cudao.buscarUno(2000).getCliente().getOficina().getCiudad().toUpperCase());
		
		

	}

}
