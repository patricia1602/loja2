package br.com.alura.loja2.Dao;

import javax.persistence.EntityManager;

import br.com.alura.loja2.modelo.Pedido;

public class PedidoDao {

	private EntityManager em;

	public PedidoDao(EntityManager em) {
		this.em = em;

	}

	public void cadastrar(Pedido pedido) {
		this.em.persist(pedido);
	}

}
