package br.edu.ifrn.sistcc.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Avaliador extends Docente {
	private static final long serialVersionUID = 1L;
	private List<String> areasInteresse;
	private List<Parecer> pareceres;
	
	public Avaliador() {
		super();
	}
	public List<String> getAreasInteresse() {
		return areasInteresse;
	}
	public void setAreasInteresse(List<String> areasInteresse) {
		this.areasInteresse = areasInteresse;
	}
	
	@OneToMany(mappedBy="avaliador")
	public List<Parecer> getPareceres() {
		return pareceres;
	}
	public void setPareceres(List<Parecer> pareceres) {
		this.pareceres = pareceres;
	}
}
