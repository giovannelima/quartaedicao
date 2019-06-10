package br.com.park.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import br.com.park.object.funcionarios;

public class funcionariosBD {

	PreparedStatement stmt = null;
	Connection con = null;
	boolean verifica = false;
	private static ArrayList<funcionarios> lista = new ArrayList<funcionarios>();

	public boolean insert(funcionarios insere) throws ClassNotFoundException, SQLException {
		funcionarios parking = new funcionarios();
		boolean retorno = false;
		con = this.getConnection();

		String sql = "insert into estacionamento.funcionarios (usu_codigo, usu_nome, usu_login, usu_senha)"
				+ " values (?,?,?,?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, insere.getCodigo());
		ps.setString(2, insere.getNome());
		ps.setString(3, insere.getLogin());
		ps.setString(4, insere.getSenha());
		ps.executeUpdate();

		retorno = (insere.getCodigo() > 0);
		con.close();
		return retorno;
	}

	public static funcionarios identificacao(String login, String senha) {
		funcionarios funcionarioEncontrado = null;
		for (int i = 0; i < lista.size(); i++) {
			funcionarios funcionarios = lista.get(i);
			if (funcionarios.getLogin().equals(login) && funcionarios.getSenha().equals(senha)) {
				funcionarioEncontrado = funcionarios;
				break;
			}
		}
		return funcionarioEncontrado;
	}

	private Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}

}
