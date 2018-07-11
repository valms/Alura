package br.vjunior.financas.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Cliente {
	
	@Id
	@SequenceGenerator(name = "cliente_idmodel_seq", sequenceName = "cliente_idmodel_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cliente_idmodel_seq")
	private Integer id;
	
	private String nome;
	
	private String profissao;
	
	private String endereco;
	
	@JoinColumn(unique = true)
	@OneToOne
	private Conta conta;
}
