package br.com.java_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/** Sobrescrevendo método do HttpServlet para aceitar somente informações via POST **/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("Cadastrando nova empresa");

		/** REQUEST - Captando informações do browser**/
		/** Através do request podemos receber informações através do browser**/ 
		String nomeEmpresa = request.getParameter("nome");
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		
		
		/** Simulamos um banco de dados para captar todas as entradas do browser **/
		Banco banco = new Banco();
		banco.adiciona(empresa);
		
		
		/** RESPONSE - Respondendo browser **/
		PrintWriter out = response.getWriter();
		out.println("<html> <body> Empresa " + nomeEmpresa + " cadastrada com sucesso! </body> </html>");
		
	}

}
