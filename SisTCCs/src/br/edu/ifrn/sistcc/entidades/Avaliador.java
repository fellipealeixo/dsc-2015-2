package br.edu.ifrn.sistcc.entidades;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class Avaliador extends Docente {
	private static final long serialVersionUID = -9035890147392666058L;
	
	@ManyToMany
	private List<AreaInteresse> areasDeInteresse;
	@OneToMany(mappedBy="avaliador")
	private List<Parecer> pareceres;
	
	public Avaliador() {
		super();
	}
	
	public List<AreaInteresse> getAreasDeInteresse() {
		return areasDeInteresse;
	}
	public void setAreasDeInteresse(List<AreaInteresse> areasDeInteresse) {
		this.areasDeInteresse = areasDeInteresse;
	}
	
	public List<Parecer> getPareceres() {
		return pareceres;
	}
	public void setAvaliacoes(List<Parecer> pareceres) {
		this.pareceres = pareceres;
	}
}