package br.edu.ifrn.sistcc.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Evento {
	@Id
	private int id;
	@SuppressWarnings("unused")
	private String titulo;
	@OneToOne
	private Periodo inscricoes;
	@OneToOne
	private Periodo realizacao;
	@SuppressWarnings("unused")
	private String urlSite;
	@SuppressWarnings("unused")
	private String local;
	
	@OneToMany(mappedBy="evento")
	private List<Submissao> submissoes;
	@ManyToMany(mappedBy="eventos")
	private List<Docente> organizadores;
	@ManyToOne
	private RegrasSubmissao regrasSubmissao;
}
