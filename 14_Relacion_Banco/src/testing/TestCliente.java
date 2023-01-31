package testing;

import modelo.dao.ClienteDaoImplList;
import modelo.javabean.Cliente;

public class TestCliente {

	public static void main(String[] args) {
		ClienteDaoImplList clidao = new ClienteDaoImplList();
		
		System.out.println("listar todos");
		for (Cliente ele: clidao.buscarTodos())
			System.out.println(ele);
		
		System.out.println("listar por oficina");
		int idOficina = 9001;
		for (Cliente ele: clidao.buscarClientesOficina(9003))
			System.out.println(ele);
		
		System.out.println("listar una");
		System.out.println(clidao.buscarUno("1234A"));

	}

}
