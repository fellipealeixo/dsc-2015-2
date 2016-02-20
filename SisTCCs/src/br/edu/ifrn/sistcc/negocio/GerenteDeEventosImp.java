package br.edu.ifrn.sistcc.negocio;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import br.edu.ifrn.sistcc.daos.SubmissaoDAO;
import br.edu.ifrn.sistcc.entidades.Submissao;
import br.edu.ifrn.sistcc.excecoes.EventoInvalidoException;

@Stateless
public class GerenteDeEventosImp implements GerenteDeEventos {
	@EJB
	private SubmissaoDAO submissaoDAO;

	public GerenteDeEventosImp() {
	}

	@Override
	public List<Submissao> submissoesPorEvento(int idEvento) throws EventoInvalidoException {
		// TODO verificar se o id do evento é válido
		
		// Se o id for válido
		return submissaoDAO.submissoesPorEvento(idEvento);
	}

}
