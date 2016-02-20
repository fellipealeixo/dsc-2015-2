package br.edu.ifrn.sistcc.excecoes;

public class EventoInvalidoException extends Exception {
	private static final long serialVersionUID = -6037784284415777227L;

	public EventoInvalidoException() {
		super("O identificador de evento não é válido");
	}

	public EventoInvalidoException(String message) {
		super(message);
	}

	public EventoInvalidoException(Throwable cause) {
		super(cause);
	}

	public EventoInvalidoException(String message, Throwable cause) {
		super(message, cause);
	}

	public EventoInvalidoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
