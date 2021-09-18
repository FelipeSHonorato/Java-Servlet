package br.com.java_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/** Adicionado um mapeamento para o servlet ser acessado via browser,no caso mapeamos para ola**/
@WebServlet(urlPatterns = "/ola")

/** Adicionado extensão HttpServlet para informar que a classe é um servlet **/
public class OlaMundoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

/** HttpServletRequest é responsável pela requisição do browser**/
/** HttpServletResponse é responsável pela reposta para o browser
 * @throws IOException **/
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		/**Envia uma mensagem para o navegador em formato HMTL através do PrintWriter**/
		PrintWriter out = resp.getWriter();
		out.println("<html> <body> Ola Mundo! </body> </html>");
		
		/**Envia uma mensagem no console para informar que foi executado com sucesso **/
		System.out.println("Mensagem enviada com sucesso!");
	}

}
