package br.vjunior.financas.teste;

import br.vjunior.financas.model.Categoria;
import br.vjunior.financas.model.Conta;
import br.vjunior.financas.model.Movimetacao;
import br.vjunior.financas.model.TipoMovimentacao;
import br.vjunior.financas.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;

public class MovimentacaoCategoria {
	
	public static void main(String[] args) {
		Categoria categoriaViagem = new Categoria( "Viagem" );
		Categoria categoriaNegocios = new Categoria( "Negócios" );
		
		Conta conta = new Conta();
		conta.setId( 2 );
		
		Movimetacao movimetacao1 = new Movimetacao();
		movimetacao1.setData( Calendar.getInstance() );
		movimetacao1.setDescricao( "Viagem à SP" );
		movimetacao1.setTipo( TipoMovimentacao.SAIDA );
		movimetacao1.setValor( new BigDecimal( "100.0" ) );
		movimetacao1.setCategoria( Arrays.asList( categoriaViagem, categoriaNegocios ) );
		movimetacao1.setConta( conta );
		
		Movimetacao movimetacao2 = new Movimetacao();
		movimetacao2.setData( Calendar.getInstance() );
		movimetacao2.setDescricao( "Viagem ao RJ" );
		movimetacao2.setTipo( TipoMovimentacao.SAIDA );
		movimetacao2.setValor( new BigDecimal( "300.0" ) );
		movimetacao2.setCategoria( Arrays.asList( categoriaViagem, categoriaNegocios ) );
		movimetacao2.setConta( conta );
		
		EntityManager entityManager = new JPAUtil().getEntityManager();
		entityManager.getTransaction().begin();
		
		entityManager.persist( categoriaNegocios );
		entityManager.persist( categoriaViagem );
		
		entityManager.persist( movimetacao1 );
		
		entityManager.getTransaction().commit();
		entityManager.close();
		new JPAUtil().closeEntityManagerFactory();
	}
}
