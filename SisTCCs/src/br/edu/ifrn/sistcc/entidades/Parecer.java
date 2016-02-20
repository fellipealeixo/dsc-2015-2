package br.edu.ifrn.sistcc.entidades;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Parecer implements Serializable {
	private static final long serialVersionUID = -3656867637559099274L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Enumerated(EnumType.ORDINAL)
	private ResumoParecer resumo;
	private String comentarios;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataLimite;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataFinalizado;
	@ManyToOne
	private Submissao submissao;
	@ManyToOne
	private Avaliador avaliador;
	
	public Parecer() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public ResumoParecer getResumo() {
		return resumo;
	}
	public void setResumo(ResumoParecer resumo) {
		this.resumo = resumo;
	}
	
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	
	public Calendar getDataLimite() {
		return dataLimite;
	}
	public void setDataLimite(Calendar dataLimite) {
		this.dataLimite = dataLimite;
	}
	
	public Calendar getDataFinalizado() {
		return dataFinalizado;
	}
	public void setDataFinalizado(Calendar dataFinalizado) {
		this.dataFinalizado = dataFinalizado;
	}
	
	public Submissao getSubmissao() {
		return submissao;
	}
	public void setSubmissao(Submissao submissao) {
		this.submissao = submissao;
	}
	
	public Avaliador getAvaliador() {
		return avaliador;
	}
	public void setAvaliador(Avaliador avaliador) {
		this.avaliador = avaliador;
	}
}
