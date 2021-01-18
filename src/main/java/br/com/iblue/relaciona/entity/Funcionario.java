package br.com.iblue.relaciona.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="funcionario")
@PrimaryKeyJoinColumn(name="id")

public class Funcionario extends Pessoa implements Serializable {


	 private static final long serialVersionUID = 1L;
	 @Column(name="cargo",length=50)
	 @JsonProperty("cargo")
	 private String cargo;
	 
	 @JsonProperty("nivel")
	 @Column(name="nivel",length=50)
	 private String nivel;
	 
	 @JsonProperty("salario")
	 @Column(name="salario")
	 private Double salario;

	 @JsonProperty("desconto")
	 @Column(name="desconto")
	 private Double desconto;
	 
	 @JsonProperty("acrescimo")
	 @Column(name="acrescimo")
	 private Double acrescimo;

  	 public Funcionario() {
		// TODO Auto-generated constructor stub
	}
	  
	public Funcionario(Long id, String nome, String email, String cargo, String nivel, Double salario,
			Double desconto, Double acrescimo) {
		super(id, nome, email);
		this.cargo = cargo;
		this.nivel = nivel;
		this.salario = salario;
		this.desconto = desconto;
		this.acrescimo = acrescimo;
	}

	
	
	public Funcionario(Long id, String cargo, String nivel, Double salario, Double desconto, Double acrescimo) {
		
		this.cargo = cargo;
		this.nivel = nivel;
		this.salario = salario;
		this.desconto = desconto;
		this.acrescimo = acrescimo;
	}


 
   
	@Override
	public String toString() {
		return "Funcionario [cargo=" + cargo + ", nivel=" + nivel + 
				", salario=" + salario + ", desconto=" + desconto
				+ ", acrescimo=" + acrescimo + "]";
	}


	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Double getAcrescimo() {
		return acrescimo;
	}

	public void setAcrescimo(Double acrescimo) {
		this.acrescimo = acrescimo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	 
	 
	 
}

