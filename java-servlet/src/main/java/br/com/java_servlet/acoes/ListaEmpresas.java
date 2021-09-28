package br.com.java_servlet.acoes;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.java_servlet.modelo.Banco;
import br.com.java_servlet.modelo.Empresa;

public class ListaEmpresas {
	
	public void executa(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		
		System.out.println("listando empresas");
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		request.setAttribute("empresas", lista);
		
		/**Adicionando ao dispatcher para receber no listaEmpresas.jsp**/
		RequestDispatcher rd = request.getRequestDispatcher("/listaEmpresas.jsp");
		rd.forward(request, response);
	}

}
