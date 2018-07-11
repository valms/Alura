package br.vjunior.financas.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Categoria {
	
	/**
	 * For <strong>JSP</strong> use only
	 */
	@Deprecated
	public Categoria() {
	}
	
	public Categoria(String nome) {
		this.nome = nome;
	}
	
	@Id
	@SequenceGenerator(name = "categoria_idmodel_seq", sequenceName = "categoria_idmodel_seq", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "categoria_idmodel_seq")
	private Integer id;
	
	private String nome;
	
}
