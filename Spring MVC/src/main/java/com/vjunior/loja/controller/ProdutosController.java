package com.vjunior.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutosController {
	
	@RequestMapping("/produtos/form")
	public String form(){
		return "produtos/form";
	}

	@RequestMapping("/produtos")
	public String grava(){
		return null; //TODO: Parei aqui
	}
}
