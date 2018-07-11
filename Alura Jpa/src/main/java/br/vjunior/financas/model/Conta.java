package br.vjunior.financas.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Conta {
	
	@Id
	@SequenceGenerator(name = "conta_idmodel_seq", sequenceName = "conta_idmodel_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "conta_idmodel_seq")
	private Integer id;
	private String titular;
	private String banco;
	private String agencia;
	private String numero;
	
	@OneToMany (mappedBy = "conta")
	private List<Movimetacao> movimetacoes;
}
