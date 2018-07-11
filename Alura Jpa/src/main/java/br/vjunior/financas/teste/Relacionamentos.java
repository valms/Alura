package br.vjunior.financas.teste;

import br.vjunior.financas.model.Conta;
import br.vjunior.financas.model.Movimetacao;
import br.vjunior.financas.model.TipoMovimentacao;
import br.vjunior.financas.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.Calendar;

public class Relacionamentos {
	public static void main(String[] args) {
		EntityManager entityManager = new JPAUtil().getEntityManager();
		entityManager.getTransaction().begin();
		
		Conta conta = entityManager.find( Conta.class, 1 );
		
		Movimetacao movimetacao = new Movimetacao();
		movimetacao.setData( Calendar.getInstance() );
		movimetacao.setDescricao( "Churrascaria" );
		movimetacao.setTipo( TipoMovimentacao.SAIDA );
		movimetacao.setValor( new BigDecimal( "200.0" ) );
		
		movimetacao.setConta( conta );
		
		entityManager.persist( movimetacao );
		
		entityManager.getTransaction().commit();
		entityManager.close();
		new JPAUtil().closeEntityManagerFactory();
	}
}
