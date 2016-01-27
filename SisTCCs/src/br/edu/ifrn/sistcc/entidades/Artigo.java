package br.edu.ifrn.sistcc.entidades;

import java.io.Serializable;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Artigo implements Serializable {
	private static final long serialVersionUID = -4186466624283828230L;
	private int id;
	private String titulo;
	private String resumo;
	private String caminho;
	private Calendar dataSubmissao;
	private EstadoArtigo status;
	
	private Autor autor;
	private Evento evento;
	private List<Parecer> pareceres;
	
	public Artigo() {
		super();
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public String getCaminho() {
		return caminho;
	}
	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	public Calendar getDataSubmissao() {
		return dataSubmissao;
	}
	public void setDataSubmissao(Calendar dataSubmissao) {
		this.dataSubmissao = dataSubmissao;
	}
	
	@Enumerated(EnumType.ORDINAL)
	public EstadoArtigo getStatus() {
		return status;
	}
	public void setStatus(EstadoArtigo status) {
		this.status = status;
	}
	
	@ManyToOne
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	@ManyToOne
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	@OneToMany(mappedBy="artigo")
	public List<Parecer> getPareceres() {
		return pareceres;
	}
	public void setPareceres(List<Parecer> pareceres) {
		this.pareceres = pareceres;
	}
}
