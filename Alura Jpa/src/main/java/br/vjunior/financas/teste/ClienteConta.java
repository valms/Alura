package br.vjunior.financas.teste;

import br.vjunior.financas.model.Cliente;
import br.vjunior.financas.model.Conta;
import br.vjunior.financas.util.JPAUtil;

import javax.persistence.EntityManager;

public class ClienteConta {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome( "Valmar Júnior" );
		cliente.setProfissao( "Programador" );
		cliente.setEndereco( "Rua Suécia" );
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome( "Valmar" );
		cliente2.setProfissao( "Programador 1" );
		cliente2.setEndereco( "Rua Suécia 12231312" );
		
		Conta conta = new Conta();
		conta.setId( 2 );
		
		cliente.setConta( conta );
		cliente2.setConta( conta ); // Throws: duplicate key value violates unique constraint "uk_a8p0pxvka1kuwy5y09omepofx"
		
		EntityManager entityManager = new JPAUtil().getEntityManager();
		entityManager.getTransaction().begin();
		
		entityManager.persist( cliente );
		entityManager.persist( cliente2 );
		
		entityManager.getTransaction().commit();
		entityManager.close();
		new JPAUtil().closeEntityManagerFactory();
	}
}
