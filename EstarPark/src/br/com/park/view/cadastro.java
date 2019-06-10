package br.com.park.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.park.controler.controle;
import br.com.park.model.conexaoBD;
import br.com.park.object.entrada;

/**
 * Servlet implementation class cadastro
 */
@WebServlet("/cadastro")
public class cadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;
	controle control = new controle();
	entrada entrar = new entrada();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		// TODO Auto-generated method stub
		

		PreparedStatement ps = null;
		Connection con = null;

		entrar.setModelo(request.getParameter("modelo"));
		entrar.setMarca(request.getParameter("marca"));
		entrar.setCor(request.getParameter("cor"));
		entrar.setPlaca(request.getParameter("placa"));

		control.insert(entrar);

		response.getWriter().append("/listagem").append(request.getContextPath());

	}
}
