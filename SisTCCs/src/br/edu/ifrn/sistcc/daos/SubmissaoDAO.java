package br.edu.ifrn.sistcc.daos;

import java.util.List;

import javax.ejb.Remote;

import br.edu.ifrn.sistcc.entidades.Submissao;

@Remote
public interface SubmissaoDAO {
	public boolean insereSubmissao(Submissao submissao);
	public boolean atualizaSubmissao(Submissao submissao);
	public boolean removeSubmissao(int idSubmissao);
	public List<Submissao> getTodasSubmissoes();
	public List<Submissao> getSubmisoesAtivas();
	public Submissao getSubmissao(int idSubmissao);
	public List<Submissao> submissoesPorEvento(int idEvento);
	public List<Submissao> submissoesPorAvaliador(int idAvaliador);
	public List<Submissao> submissoesAtivasPorAvaliador(int idAvaliador);
	public List<Submissao> submissoesPorUsuario(int idUsuario);
	public List<ExtratoSubmissao> quantidadeSubmissoesPorEvento();
}
