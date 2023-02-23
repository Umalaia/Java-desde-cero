package testing;

import modelo.dao.ClienteDaoImplList;
import modelo.javabean.Cliente;

public class TestCliente {

	public static void main(String[] args) {
		ClienteDaoImplList clidao = new ClienteDaoImplList();
		System.out.println("Listar todos");
		for (Cliente ele: clidao.buscarTodos())
			System.out.println(ele);
		System.out.println("Listar por oficina");
		int idOficina = 9003;
		
		for (Cliente ele: clidao.buscarClientesOficina(idOficina))
			System.out.println(ele);
		System.out.println("Listar una");
		System.out.println(clidao.buscarUno("11111A"));
		
		

	}

}
