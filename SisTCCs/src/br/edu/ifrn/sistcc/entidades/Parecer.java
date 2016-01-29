package br.edu.ifrn.sistcc.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Parecer {
	@Id
	private int id;
	@ManyToOne
	private Artigo artigo;
	@ManyToOne
	private Avaliador avaliador;
}
