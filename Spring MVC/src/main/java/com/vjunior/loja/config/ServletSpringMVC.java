package com.vjunior.loja.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Configurações para inicialização do SPRING MVC
 */
public class ServletSpringMVC extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	protected Class<?>[] getRootConfigClasses() {
		return new Class[0];
	}
	
	protected Class<?>[] getServletConfigClasses() {
		return new Class[]{AppWebConfiguration.class};
	}
	
	/**
	 * Aponta as requisiçõs que o Spring irá gerenciar
	 *
	 * @return os Paths que o spring está gerenciado
	 */
	protected String[] getServletMappings() {
		return new String[]{"/"};
	}
}
