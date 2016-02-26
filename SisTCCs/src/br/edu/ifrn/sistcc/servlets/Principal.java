package br.edu.ifrn.sistcc.servlets;

import java.io.IOException;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.edu.ifrn.sistcc.entidades.Evento;
import br.edu.ifrn.sistcc.negocio.GerenteDeEventos;


@WebServlet("/")
public class Principal extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@EJB
	private GerenteDeEventos gerEventos;
       
    public Principal() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Evento> eventos = gerEventos.getEventos();
		HttpSession sessao = request.getSession();
		sessao.setAttribute("eventos", eventos);
		response.sendRedirect("principal.jsp");
	}

}
