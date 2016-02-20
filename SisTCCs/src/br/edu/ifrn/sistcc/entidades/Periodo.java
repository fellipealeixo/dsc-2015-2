package br.edu.ifrn.sistcc.entidades;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Periodo implements Serializable {
	private static final long serialVersionUID = -7768543431816956450L;
	
	@Id
	private int id;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar inicio;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fim;
	private boolean extendido = false;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar novoFim;
	
	public Periodo() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public Calendar getInicio() {
		return inicio;
	}
	public void setInicio(Calendar inicio) {
		this.inicio = inicio;
	}

	public Calendar getFim() {
		return fim;
	}
	public void setFim(Calendar fim) {
		this.fim = fim;
	}

	public boolean isExtendido() {
		return extendido;
	}
	public void setExtendido(boolean extendido) {
		this.extendido = extendido;
	}

	public Calendar getNovoFim() {
		return novoFim;
	}
	public void setNovoFim(Calendar novoFim) {
		this.novoFim = novoFim;
	}
}
