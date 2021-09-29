package br.com.java_servlet.servlets;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//@WebFilter("/entrada")
public class MonitoramentoFilter implements Filter{

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		System.out.println("Aplicando Filtro Monitoramento");
		
		long antes = System.currentTimeMillis();
		
		String acao = request.getParameter("acao");
		
		
		// executa a ação
		chain.doFilter(request, response);
		
		long depois = System.currentTimeMillis();
		
		System.out.println("Tempo da ação foi de: " + acao + " -> "+ (depois - antes));
	}
	
	

}
