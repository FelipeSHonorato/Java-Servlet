package br.com.java_servlet.servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


//@WebFilter("/entrada")
public class AutorizacaoFilter implements Filter {
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {}
	@Override
	public void destroy() {}

   	
	public void doFilter(ServletRequest serveletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		
		//Implementando sistema de login através do cookie, verificando se em cada etapa o usuário está logado.
				
		HttpServletRequest request = (HttpServletRequest) serveletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		
		System.out.println("Aplicando Filtro Autorização");
		
		String paramAcao = request.getParameter("acao");
		
		HttpSession sessao = request.getSession();
				boolean usuarioNãoEstaLogado =  (sessao.getAttribute("usuarioLogado")== null);
				boolean ehUmaAcaoProtegida = !(paramAcao.equals("Login") || paramAcao.equals("LoginForm"));
				
				if (ehUmaAcaoProtegida &&  usuarioNãoEstaLogado) {
					response.sendRedirect("entrada?acao=LoginForm");
					return;
				}	
				
		chain.doFilter(request, servletResponse);
	}
}
