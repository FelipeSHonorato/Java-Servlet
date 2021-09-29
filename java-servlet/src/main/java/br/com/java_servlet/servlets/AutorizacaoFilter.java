package br.com.java_servlet.servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebFilter("/entrada")
public class AutorizacaoFilter implements Filter {

   	
	public void doFilter(ServletRequest serveletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		//Implementando sistema de login atrav�s do cookie, verificando se em cada etapa o usu�rio est� logado.
				
		HttpServletRequest request = (HttpServletRequest) serveletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		System.out.println("Aplicando Filtro Autoriza��o");
		
		String paramAcao = request.getParameter("acao");
		
		HttpSession sessao = request.getSession();
				boolean usuarioN�oEstaLogado =  (sessao.getAttribute("usuarioLogado")== null);
				boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
				
				if (ehUmaAcaoProtegida &&  usuarioN�oEstaLogado) {
					response.sendRedirect("entrada?acao=LoginForm");
					return;
				}	
				
		chain.doFilter(request, servletResponse);
	}
}
