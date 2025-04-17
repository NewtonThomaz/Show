package com.show.Entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "Shows")
public class Show {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotNull(message = "Informe o nome do artista!")
	private String nome;
	
	@NotNull(message = "Informe a classificação etária!")
	private int classificacao;
	
	@NotNull(message = "Informe o valor do ingresso!")
	private double valor;
	
	@NotNull(message = "Informe o tempo que o show vai durar (em minutos)!")
	private int tempo;
	
	@Future
	@NotNull(message = "Informe a data do show!")
	private Date dataShow;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public Date getDataShow() {
		return dataShow;
	}

	public void setDataShow(Date dataShow) {
		this.dataShow = dataShow;
	}
	
	
}
