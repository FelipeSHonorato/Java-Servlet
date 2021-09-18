package br.com.java_servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	/** Criando um static para gerar no início do programa duas empresas **/
	static {
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("BabyMobel");
		
		lista.add(empresa);
		lista.add(empresa2);
	}
	
	

	public void adiciona(Empresa empresa) {
		lista.add(empresa);
	}
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
}
