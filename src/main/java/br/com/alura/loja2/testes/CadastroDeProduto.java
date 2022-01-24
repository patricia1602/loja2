package br.com.alura.loja2.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.alura.loja2.Dao.ProdutoDao;
import br.com.alura.loja2.modelo.Categoria;
import br.com.alura.loja2.modelo.Produto;
import br.com.alura.loja2.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {
		Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), Categoria.CELULARES);

		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao dao = new ProdutoDao(em);

		em.getTransaction().begin();
		em.persist(celular);
		em.getTransaction().commit();
		em.close();
	}
}
