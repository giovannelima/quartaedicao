package br.com.park.controler;

import java.sql.SQLException;
import java.util.List;


import br.com.park.model.conexaoBD;
import br.com.park.object.entrada;

public class controle {
	conexaoBD banco = new conexaoBD();

	public boolean insert(entrada insere) {
		boolean resultado = false;
		try {
			resultado = banco.insert(insere);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return resultado;
	}
	public List<entrada> selectAll () throws Exception {
		List<entrada> resultado = banco.selectAll();
		

		return resultado;

		
		
		
	}
	
	
	
	
}