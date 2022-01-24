package br.com.alura.loja2.Dao;

import javax.persistence.EntityManager;

import br.com.alura.loja2.modelo.Produto;

public class ProdutoDao {

	private EntityManager em;

	public ProdutoDao(EntityManager em) {
		this.em = em;

	}

	public void cadastrar(Produto produto) {
		this.em.persist(produto);
	}
}
