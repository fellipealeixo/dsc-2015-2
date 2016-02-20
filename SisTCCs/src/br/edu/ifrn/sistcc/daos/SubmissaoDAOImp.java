package br.edu.ifrn.sistcc.daos;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import br.edu.ifrn.sistcc.entidades.EstadoSubmissao;
import br.edu.ifrn.sistcc.entidades.Submissao;

@Stateless
public class SubmissaoDAOImp implements SubmissaoDAO {
	@PersistenceContext(unitName="sistcc")
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<Submissao> getTodasSubmissoes() {
		Query query = em.createNamedQuery("listarSubmissoes");
		return query.getResultList();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Submissao> getSubmisoesAtivas() {
		Query query = em.createNamedQuery("submissoesAtivas");
		query.setParameter("arquivadas", EstadoSubmissao.ARQUIVADO);
		return query.getResultList();
	}

	@Override
	public Submissao getSubmissao(int idSubmissao) {
		return em.find(Submissao.class, idSubmissao);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Submissao> submissoesPorEvento(int idEvento) {
		Query query = em.createNamedQuery("subimissoesPorEvento");
		query.setParameter("id", idEvento);
		return query.getResultList();
	}

	@Override
	public List<Submissao> submissoesPorAvaliador(int idAvaliador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Submissao> submissoesAtivasPorAvaliador(int idAvaliador) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Submissao> submissoesPorUsuario(int idUsuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ExtratoSubmissao> quantidadeSubmissoesPorEvento() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insereSubmissao(Submissao submissao) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean atualizaSubmissao(Submissao submissao) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeSubmissao(int idSubmissao) {
		// TODO Auto-generated method stub
		return false;
	}

}
