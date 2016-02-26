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
	@EJB
	private GerenteDeEventos gerEventos;
	
    public SubmissoesPorEvento() {
        super();
    }

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int idEvento = Integer.parseInt(req.getParameter("idEvento"));
		List<Submissao> lista = new ArrayList<Submissao>();
		try {
			lista = gerEventos.submissoesPorEvento(idEvento);
		} catch (EventoInvalidoException e) {
			e.printStackTrace();
		}
		HttpSession sessao = req.getSession();
		sessao.setAttribute("lista", lista);
		resp.sendRedirect("/SisTCCs/exibeSubmissoes.jsp");
	}

}
