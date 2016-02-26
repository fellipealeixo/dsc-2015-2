package br.edu.ifrn.sistcc.daos;

import java.util.List;

import javax.ejb.Remote;

import br.edu.ifrn.sistcc.entidades.Evento;

@Remote
public interface EventoDAO {

	List<Evento> getAll();

}
