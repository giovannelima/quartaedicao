package br.com.park.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.park.model.funcionariosBD;
import br.com.park.object.funcionarios;

/**
 * Servlet implementation class logando
 */
@WebServlet("/logando")
public class logando extends HttpServlet {
	private static final long serialVersionUID = 1L;
      funcionariosBD banco = new funcionariosBD();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");

		funcionarios funcionarioEncontrado = funcionariosBD.identificacao(login, senha);
		if(funcionarioEncontrado != null){
			System.out.println("Funcionario encontrado.!!");
		}
		else{
			response.getWriter().append("login.jsp").append(request.getContextPath());
		}

	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
