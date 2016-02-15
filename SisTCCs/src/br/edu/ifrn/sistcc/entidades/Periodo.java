package br.edu.ifrn.sistcc.entidades;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Periodo {
	@Id
	private int id;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar inicio;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fim;
	@SuppressWarnings("unused")
	private boolean extendido = false;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar novoFim;
}
