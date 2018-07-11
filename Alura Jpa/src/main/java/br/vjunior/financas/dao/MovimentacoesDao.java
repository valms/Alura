package br.vjunior.financas.dao;

import br.vjunior.financas.model.Conta;
import br.vjunior.financas.model.TipoMovimentacao;
import br.vjunior.financas.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class MovimentacoesDao {
	
	private EntityManager entityManager;
	
	public MovimentacoesDao() {
		this.entityManager = new JPAUtil().getEntityManager();
	}
	
	public List<Double> getMediaPorDiaTipo(TipoMovimentacao tipoMovimentacao, Conta conta) {
		
		String query = "Select distinct avg(m.valor) from Movimetacao m where m.conta = :pConta  and m.tipo = :pTipo group by m.data";
		
		TypedQuery<Double> doubleTypedQuery = this.entityManager.createQuery( query, Double.class );
		doubleTypedQuery.setParameter( "pConta", conta );
		doubleTypedQuery.setParameter( "pTipo", tipoMovimentacao );
		
		List<Double> medias = doubleTypedQuery.getResultList();
		
		this.closeDatabaseConncetion();
		return medias;
	}
	
	
	private void closeDatabaseConncetion() {
		this.entityManager.close();
		new JPAUtil().closeEntityManagerFactory();
	}
	
	
}
