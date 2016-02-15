package br.edu.ifrn.sistcc.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public class Usuario implements Serializable {
	private static final long serialVersionUID = -1884924641983729939L;
	@Id
	private int id;
	@SuppressWarnings("unused")
	private String email;
	@SuppressWarnings("unused")
	private String senha;
	@SuppressWarnings("unused")
	private String nome;
	
	public Usuario() {
		super();
	}
}