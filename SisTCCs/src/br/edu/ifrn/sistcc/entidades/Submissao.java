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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@NamedQueries({
	@NamedQuery(name="listarSubmissoes", 
				query="SELECT s FROM Submissao s"),
	@NamedQuery(name="submissoesAtivas", 
				query="SELECT s FROM Submissao s WHERE s.estado <> :arquivadas"),
	@NamedQuery(name="subimissoesPorEvento", 
				query="SELECT s FROM Submissao s WHERE s.evento.id = :id"),
	@NamedQuery(name="submissoesPorAvaliador", 
				query="SELECT p.submissao FROM Avaliador a JOIN a.pareceres p WHERE a.id = :id"),
	@NamedQuery(name="submissoesPorUsuario",
				query="SELECT s FROM AutorPrincipal a JOIN a.submissoes s WHERE a.id = :id"),
	@NamedQuery(name="quantidadeSubmissoesPorEvento",
				query="SELECT new br.edu.ifrn.sistcc.daos.ExtratoSubmissao(e.id, e.titulo, COUNT(s)) "
						+ "FROM Evento e JOIN e.submissoes s "
						+ "GROUP BY e.id")
})

@Entity
public class Submissao implements Serializable {
	private static final long serialVersionUID = -4186466624283828230L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String titulo;
	private String resumo;
	private String urlArquivo;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataSubmissao;
	@Enumerated(EnumType.ORDINAL)
	private EstadoSubmissao estado;
	private int paginas;
	
	@ManyToOne
	private AutorPrincipal autor;
	@ManyToOne
	private Evento evento;
	@OneToMany(mappedBy="submissao")
	private List<Parecer> pareceres;
	
	public Submissao() {
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
	
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	
	public String getUrlArquivo() {
		return urlArquivo;
	}
	public void setUrlArquivo(String urlArquivo) {
		this.urlArquivo = urlArquivo;
	}
	
	public Calendar getDataSubmissao() {
		return dataSubmissao;
	}
	public void setDataSubmissao(Calendar dataSubmissao) {
		this.dataSubmissao = dataSubmissao;
	}
	
	public EstadoSubmissao getEstado() {
		return estado;
	}
	public void setEstado(EstadoSubmissao status) {
		this.estado = status;
	}
	
	public AutorPrincipal getAutor() {
		return autor;
	}
	public void setAutor(AutorPrincipal autor) {
		this.autor = autor;
	}
	
	public Evento getEvento() {
		return evento;
	}
	public void setEvento(Evento evento) {
		this.evento = evento;
	}
	
	public List<Parecer> getPareceres() {
		return pareceres;
	}
	public void setPareceres(List<Parecer> pareceres) {
		this.pareceres = pareceres;
	}
	
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
}
