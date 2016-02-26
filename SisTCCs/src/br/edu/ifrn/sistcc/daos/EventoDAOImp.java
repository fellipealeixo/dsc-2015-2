package br.edu.ifrn.sistcc.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.edu.ifrn.sistcc.entidades.Evento;

@Stateless
public class EventoDAOImp implements EventoDAO {
	@PersistenceContext(unitName="sistcc")
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Evento> getAll() {
		Query query = em.createNamedQuery("getAllEventos");
		return (List<Evento>) query.getResultList();
	}

}
