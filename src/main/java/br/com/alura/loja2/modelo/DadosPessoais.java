package br.com.alura.loja2.modelo;

import javax.persistence.Embeddable;

@Embeddable
public class DadosPessoais {

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
