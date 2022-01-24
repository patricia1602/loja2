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
		
		em.flush();
		em.clear();
		
		celulares = em.merge(celulares);
		celulares.setNome("1234");
		em.flush();	
		em.clear();
		em.remove(celulares);
		em.flush();
	}
}
