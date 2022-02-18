package br.com.alura.loja2.modelo;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class DadosPessoais implements Serializable {

	private static final long serialVersionUID = 1L;

	private String nome;
	private String cpf;

	public DadosPessoais() {

	}

	public DadosPessoais(String nome, String CPF) {
		this.nome = nome;
		this.cpf = CPF;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

}
