package servlets;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import business.Inscritos; //Você precisa importar a classe que esta em outro pacote pra usá-la
import java.util.List; //pra usar tem que importar esses dois
import java.util.ArrayList;

/**
 * Servlet implementation class ServletInscritos
 */
@WebServlet("/ServletInscritos")
public class ServletInscritos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	
	  private List<Inscritos> listaInscritos = new ArrayList<>();

    public ServletInscritos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html; charset=UTF-8");
		
		// Obtendo os valores do formulário
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String participacao = request.getParameter("participacao");
        String pagamento = request.getParameter("tipopagamento");
        
        // Criando o objeto Inscrito
        Inscritos inscrito = new Inscritos(nome, email, participacao, pagamento);
        listaInscritos.add(inscrito);
        
        // Configurando o tipo de resposta
        response.setContentType("text/html");

        // Enviando a lista de inscritos como resposta
        PrintWriter out = response.getWriter();
        
        out.println("<html><body>");
        out.println("<h1>Lista de Inscritos</h1>");
        out.println("<ul>");
        for (Inscritos i : listaInscritos) {
            out.println("<li>");
            out.println("Nome: " + i.getNome() + ", Email: " + i.getEmail() +
                    ", Tipo de Participação: " + i.getParticipacao() +
                    ", Meio de Pagamento: " + i.getPagamento());
            out.println("</li>");
        }
        out.println("</ul>");
        
        out.println("<a href='ServletFormInscricao'>Voltar ao formulário</a>");
        
        out.println("</body></html>");
        
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
