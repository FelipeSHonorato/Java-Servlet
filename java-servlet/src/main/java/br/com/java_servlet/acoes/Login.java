package br.com.java_servlet.acoes;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.java_servlet.modelo.Banco;
import br.com.java_servlet.modelo.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		System.out.println("Logando " + login);
		
		Banco banco = new Banco();
		Usuario usuario = banco.existeUsuario(login, senha);
		
		if(usuario != null) {
			System.out.println("Usu?rio Existe");
			
			//Usu?rio guarda em cookie o login e senha atrav?s do HttpSession
			HttpSession sessao = request.getSession();
			sessao.setAttribute("usuarioLogado", usuario);
			
			return "redirect:index.html";
		}else {
			return "redirect:entrada?acao=LoginForm";
		}
		
		
	}

}
