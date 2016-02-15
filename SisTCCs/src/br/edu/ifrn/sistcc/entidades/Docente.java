package br.edu.ifrn.sistcc.entidades;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Docente extends Usuario {
	private static final long serialVersionUID = -7675914358078958910L;
	private String siape;
	private String urlLattes;

	private List<Evento> eventos;
	
	public Docente() {
		super();
	}
	
	@Basic(optional=false)
	public String getSiape() {
		return siape;
	}
	public void setSiape(String siape) {
		this.siape = siape;
	}
	
	public String getUrlLattes() {
		return urlLattes;
	}
	public void setUrlLattes(String urlLattes) {
		this.urlLattes = urlLattes;
	}
	
	@ManyToMany
	public List<Evento> getEventos() {
		return eventos;
	}
	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
}
