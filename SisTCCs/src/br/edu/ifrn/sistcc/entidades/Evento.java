package br.edu.ifrn.sistcc.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@NamedQueries({
	@NamedQuery(name="getAllEventos", query="SELECT e FROM Evento e")
})

@Entity
public class Evento implements Serializable {
	private static final long serialVersionUID = 1226900262805659779L;
	
	@Id
	private int id;
	private String titulo;
	@OneToOne
	private Periodo inscricoes;
	@OneToOne
	private Periodo realizacao;
	private String urlSite;
	private String local;
	@OneToMany(mappedBy="evento")
	private List<Submissao> submissoes;
	@ManyToMany(mappedBy="eventos")
	private List<Docente> organizadores;
	@ManyToOne
	private RegrasSubmissao regrasSubmissao;
	
	public Evento() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Periodo getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(Periodo inscricoes) {
		this.inscricoes = inscricoes;
	}

	public Periodo getRealizacao() {
		return realizacao;
	}
	public void setRealizacao(Periodo realizacao) {
		this.realizacao = realizacao;
	}

	public String getUrlSite() {
		return urlSite;
	}
	public void setUrlSite(String urlSite) {
		this.urlSite = urlSite;
	}

	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}

	public List<Submissao> getSubmissoes() {
		return submissoes;
	}
	public void setSubmissoes(List<Submissao> submissoes) {
		this.submissoes = submissoes;
	}

	public List<Docente> getOrganizadores() {
		return organizadores;
	}
	public void setOrganizadores(List<Docente> organizadores) {
		this.organizadores = organizadores;
	}

	public RegrasSubmissao getRegrasSubmissao() {
		return regrasSubmissao;
	}
	public void setRegrasSubmissao(RegrasSubmissao regrasSubmissao) {
		this.regrasSubmissao = regrasSubmissao;
	}
}
