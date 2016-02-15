package br.edu.ifrn.sistcc.entidades;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Parecer {
	@Id
	private int id;
	@Enumerated(EnumType.ORDINAL)
	private ResumoParecer resumo;
	@SuppressWarnings("unused")
	private String comentarios;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataLimite;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataFinalizado;
	@ManyToOne
	private Submissao submissao;
	@ManyToOne
	private Avaliador avaliador;
}
