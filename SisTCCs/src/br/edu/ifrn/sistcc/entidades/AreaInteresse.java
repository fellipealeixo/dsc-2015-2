package br.edu.ifrn.sistcc.entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class AreaInteresse implements Serializable {
	private static final long serialVersionUID = -280945226077963636L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String area;
	
	@ManyToMany(mappedBy="areasDeInteresse")
	private List<Avaliador> avaliadores;
	
	public AreaInteresse() {
		super();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	public List<Avaliador> getAvaliadores() {
		return avaliadores;
	}
	public void setAvaliadores(List<Avaliador> avaliadores) {
		this.avaliadores = avaliadores;
	}
}
