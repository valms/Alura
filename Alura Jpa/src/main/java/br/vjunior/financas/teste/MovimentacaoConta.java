package br.vjunior.financas.teste;

import br.vjunior.financas.dao.MovimentacoesDao;
import br.vjunior.financas.model.Conta;
import br.vjunior.financas.model.TipoMovimentacao;

public class MovimentacaoConta {
	
	public static void main(String[] args) {
		MovimentacoesDao movimentacoesDao = new MovimentacoesDao();
		
		Conta conta = new Conta();
		conta.setId( 2 );
		
		for (Double media : movimentacoesDao.getMediaPorDiaTipo( TipoMovimentacao.SAIDA, conta )) {
			System.out.println( media );
		}
		
	}
}
