package br.vjunior.financas.teste;

import br.vjunior.financas.model.Conta;
import br.vjunior.financas.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Aplicacao {
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.setTitular( "Valmar Júnior" );
		conta.setBanco( "Banco do Brasil" );
		conta.setAgencia( "1234-0" );
		conta.setNumero( "456" );
		
		EntityManager entityManager = new JPAUtil().getEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist( conta );
		entityManager.getTransaction().commit();
		
		entityManager.close();
		
	}
}
