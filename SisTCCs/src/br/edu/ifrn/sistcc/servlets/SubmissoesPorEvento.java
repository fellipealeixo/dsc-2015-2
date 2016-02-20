package br.edu.ifrn.sistcc.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.edu.ifrn.sistcc.entidades.Submissao;
import br.edu.ifrn.sistcc.excecoes.EventoInvalidoException;
import br.edu.ifrn.sistcc.negocio.GerenteDeEventos;

@WebServlet("/SubmissoesPorEvento")
public class SubmissoesPorEvento extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("unused")
	private int idEvento;
	@EJB
	private GerenteDeEventos gerEventos;
	
    public SubmissoesPorEvento() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Submissao> lista = new ArrayList<Submissao>();
		try {
			lista = gerEventos.submissoesPorEvento(1);
		} catch (EventoInvalidoException e) {
			e.printStackTrace();
		}
		HttpSession sessao = req.getSession();
		sessao.setAttribute("lista", lista);
		resp.sendRedirect("/SisTCCs/exibeSubmissoes.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recupera o valor do idEvento;
		idEvento = Integer.parseInt(request.getParameter("idEvento"));
		doGet(request, response);
	}

}
