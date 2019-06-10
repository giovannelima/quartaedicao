package br.com.park.view;

import java.io.IOException;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import br.com.park.model.conexaoBD;
import br.com.park.object.entrada;

/**
 * Servlet implementation class listagem
 */
@WebServlet(description = "Servlet para listagem dos carros já cadastradas", urlPatterns = {"/listagem"})
public class listagem extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private controle controle = new controle();
	conexaoBD banco = new conexaoBD();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			List<entrada> carros = banco.selectAll();
			
			request.setAttribute("carros", carros);
			

			request.getRequestDispatcher("/listagem2.jsp").forward(request, response);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
	

}
