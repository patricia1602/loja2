package br.com.alura.loja2.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.alura.loja2.Dao.CategoriaDao;
import br.com.alura.loja2.Dao.ProdutoDao;
import br.com.alura.loja2.modelo.Categoria;
import br.com.alura.loja2.modelo.Produto;
import br.com.alura.loja2.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {

		Categoria celulares = new Categoria("CELULARES");

		EntityManager em = JPAUtil.getEntityManager();
		em.getTransaction().begin();

		em.persist(celulares);
		celulares.setNome("XPTO");
		
		em.getTransaction().commit();
		em.close();
		
		celulares.setNome("1234");
	}
}
