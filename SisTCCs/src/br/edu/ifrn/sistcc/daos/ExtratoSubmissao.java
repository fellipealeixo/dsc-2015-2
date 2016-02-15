package br.edu.ifrn.sistcc.daos;

public class ExtratoSubmissao {
	private int idEvento;
	private String tituloEvento;
	private long quantidadeSubmissoes;
	
	public ExtratoSubmissao() {
		super();
	}

	public ExtratoSubmissao(int id, String titulo, long quantidadeSubmissoes) {
		super();
		this.idEvento = id;
		this.tituloEvento = titulo;
		this.quantidadeSubmissoes = quantidadeSubmissoes;
	}

	public int getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(int idEvento) {
		this.idEvento = idEvento;
	}

	public String getTituloEvento() {
		return tituloEvento;
	}

	public void setTituloEvento(String titulo) {
		this.tituloEvento = titulo;
	}

	public long getQuantidadeSubmissoes() {
		return quantidadeSubmissoes;
	}

	public void setQuantidadeSubmissoes(long quantidadeSubmissoes) {
		this.quantidadeSubmissoes = quantidadeSubmissoes;
	}
}
