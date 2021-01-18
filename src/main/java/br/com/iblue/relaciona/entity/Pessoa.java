package br.com.iblue.relaciona.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="pessoa")
@Inheritance(strategy=InheritanceType.JOINED)
public class Pessoa implements Serializable{
 
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="seq_codigo")
	@Column(name="id")
	@JsonProperty("id")
	private Long id;
	
	@Column(name="nome",length=50,nullable = false)
	@JsonProperty("nome")
	private String nome;
	
	@Column(name="email",
			length=50,
			nullable = false)
	@JsonProperty("email")
	private String email;
	
	
 
	
	
	public Pessoa(Long id, String nome, String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
	}


	public Pessoa() {
		super();
	}

 
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", email=" + email + "]";
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	 
	
	
}