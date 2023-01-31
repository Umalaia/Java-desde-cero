package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Cliente;
import modelo.javabean.Oficina;

public interface BancoDao {

	boolean altaOficina(Oficina oficina);
	boolean eliminarOficina(Oficina oficina);
	Oficina eliminarOficina(int posRelativa);
	Oficina modificarOficina(Oficina oficina);
	Oficina buscarUna(int idOficina);
	ArrayList<Oficina> buscarTodos();
	ArrayList<Oficina> buscarPorPrefijo(String prefijo);
	ArrayList<Oficina> buscarPorCiudad(String ciudad);
	
	
	
}
