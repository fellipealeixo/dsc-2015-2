package br.edu.ifrn.sistcc.negocio;

import java.util.List;

import javax.ejb.Remote;

import br.edu.ifrn.sistcc.entidades.Evento;
import br.edu.ifrn.sistcc.entidades.Submissao;
import br.edu.ifrn.sistcc.excecoes.EventoInvalidoException;

@Remote
public interface GerenteDeEventos {
	public List<Submissao> submissoesPorEvento(int idEvento) throws EventoInvalidoException;
	public List<Evento> getEventos();
}
