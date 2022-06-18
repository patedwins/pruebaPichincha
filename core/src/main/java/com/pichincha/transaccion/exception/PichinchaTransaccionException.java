package com.pichincha.transaccion.exception;

public class PichinchaTransaccionException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public PichinchaTransaccionException(String message) {
		super(message);
	}

	public PichinchaTransaccionException(String message, Throwable cause) {
		super(message, cause);
	}

	public PichinchaTransaccionException(Throwable cause) {
		super(cause);
	}
}
