package br.com.api.clean.java.service.exceptions;

public class UsuarioNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public UsuarioNotFoundException (String message) {
		super(message);
	}

	
}
