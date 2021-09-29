package br.com.java_servlet.servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.java_servlet.acoes.Acao;


//@WebFilter("/entrada")
public class ControladorFilter implements Filter {

   	
	public void doFilter(ServletRequest serveletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		//Implementando sistema de login através do cookie, verificando se em cada etapa o usuário está logado.
		HttpServletRequest request = (HttpServletRequest) serveletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		System.out.println("Aplicando Filtro Controlador");
		

		String paramAcao = request.getParameter("acao");
		String nomeDaClasse = "br.com.java_servlet.acoes." + paramAcao;
		
		String nome;
		try {
			Class classe = Class.forName(nomeDaClasse);
			Acao acao = (Acao) classe.newInstance();
			nome = acao.executa(request, response);
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ServletException | IOException e) {
			throw new ServletException(e);
		}
		
		
		String[] tipoEndereco = nome.split(":");
		
		if(tipoEndereco[0].equals("forward")) {
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/view/"+tipoEndereco[1]);
		rd.forward(request, response);
		}
		else {
			response.sendRedirect(tipoEndereco[1]);
		}
	}
}
