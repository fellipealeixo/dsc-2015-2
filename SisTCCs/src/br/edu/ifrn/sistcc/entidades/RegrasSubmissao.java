package br.edu.ifrn.sistcc.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class RegrasSubmissao implements Serializable {
	private static final long serialVersionUID = 7829635024559954362L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String descricao;
	private int limiteDePaginas;
	private String urlModelo;
	
	@OneToMany(mappedBy="regrasSubmissao")
	private List<Evento> eventos;
	
	public RegrasSubmissao() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getLimiteDePaginas() {
		return limiteDePaginas;
	}
	public void setLimiteDePaginas(int limiteDePaginas) {
		this.limiteDePaginas = limiteDePaginas;
	}

	public String getUrlModelo() {
		return urlModelo;
	}
	public void setUrlModelo(String urlModelo) {
		this.urlModelo = urlModelo;
	}

	public List<Evento> getEventos() {
		return eventos;
	}
	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
}
