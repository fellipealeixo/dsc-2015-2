package br.edu.ifrn.sistcc.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class AutorPrincipal extends Usuario {
	@SuppressWarnings("unused")
	private String vinculacao;
	@OneToMany(mappedBy="autor")
	private List<Submissao> submissoes;
	
	public AutorPrincipal() {
		super();
	}
}
