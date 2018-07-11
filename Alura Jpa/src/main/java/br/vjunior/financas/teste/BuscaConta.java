package br.vjunior.financas.teste;

import br.vjunior.financas.model.Conta;
import br.vjunior.financas.util.JPAUtil;

import javax.persistence.EntityManager;

public class BuscaConta {
	
	public static void main(String[] args) {
		EntityManager entityManager = new JPAUtil().getEntityManager();
		entityManager.getTransaction().begin();
		
		Conta conta = entityManager.find( Conta.class, 1 );
		
		System.out.println(conta.getTitular());
		
		entityManager.getTransaction().commit();
		entityManager.close();
		new JPAUtil().closeEntityManagerFactory();
		
		
	}
}
