
<%@page import="java.io.PrintWriter"%>
<%@page import="br.com.park.model.funcionariosBD"%>
<%@page import="br.com.park.object.funcionarios"%>
<%

String login = request.getParameter("login");
String senha = request.getParameter("senha");

funcionarios funcionarioEncontrado = funcionariosBD.identificacao(login, senha);

if(funcionarioEncontrado != null){
	 %>
	 
	 Usuario logado
	 
	 <%
}
else{
	response.sendRedirect("login.jsp");
}


%>