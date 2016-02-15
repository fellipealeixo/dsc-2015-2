package br.edu.ifrn.sistcc.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class RegrasSubmissao implements Serializable {
	private static final long serialVersionUID = 7829635024559954362L;
	@Id
	private int id;
	@SuppressWarnings("unused")
	private String descricao;
	@SuppressWarnings("unused")
	private int limiteDePaginas;
	@SuppressWarnings("unused")
	private String urlModelo;
	
	@OneToMany(mappedBy="regrasSubmissao")
	private List<Evento> eventos;
}
