package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletFormInscricao
 */
@WebServlet("/ServletFormInscricao")
public class ServletFormInscricao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletFormInscricao() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		
		try(PrintWriter out = response.getWriter()){
			out.println("<!DOCTYPE HTML>");
			
			out.println("<html>");
			out.println("<head><title>Inscrição Palestra</title></head>");
			out.println("<body>");
			out.println("<h2>Inscrição Palestra</h2>");
			
			out.println("<h3>Formulário de inscrição:</h3>");
			
			out.println("<form action='ServletInscritos' method='get'>");
			
			out.println("Nome: <input type='text' name='nome'><br/>");
			out.println("Email: <input type='email' name='email'><br/>");
		    out.println("Participação online: <input type='radio' name='participacao' value='online' checked><br/>"); 
		    out.println("Participação presencial: <input type='radio' name='participacao' value='presencial'><br/>");
		    
		    out.println("Forma de pagamento: <select id='pagamento' name='tipopagamento'>"
		    		+ "<option value='credito'>Cartão de crédito</option>"
		    		+ "<option value='pix'>Pix</option>"
		    		+ "<option value='boleto'>Boleto bancário</option>"
		    		+ "  </select><br/>");
            out.println("<input type='submit' name='Enviar' value='Enviar dados'><br/>");
			
			out.println("</form>");

			out.println("</body>");
			out.println("</html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
