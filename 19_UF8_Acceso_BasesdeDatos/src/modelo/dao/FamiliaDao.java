package modelo.dao;

import modelo.javabeans.Familia;

public interface FamiliaDao {
	
	Lista<Familia> buscarTodas();
	Familia buscarUna(int idFamilia);
	int altaFamilia(Familia familia);

}
