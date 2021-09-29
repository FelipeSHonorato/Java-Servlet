package br.com.java_servlet.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Adicionado um mapeamento para o servlet ser acessado via browser,no caso mapeamos para ola**/
//@WebServlet(urlPatterns = "/ola")

/** Adicionado extens�o HttpServlet para informar que a classe � um servlet **/
public class OlaMundoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

/** HttpServletRequest � respons�vel pela requisi��o do browser**/
/** HttpServletResponse � respons�vel pela reposta para o browser
 * @throws IOException **/
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		/**Envia uma mensagem para o navegador em formato HMTL atrav�s do PrintWriter**/
		PrintWriter out = resp.getWriter();
		out.println("<html> <body> Ola Mundo! </body> </html>");
		
		/**Envia uma mensagem no console para informar que foi executado com sucesso **/
		System.out.println("Mensagem enviada com sucesso!");
	}

}
