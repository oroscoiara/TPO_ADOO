package Clases;

public class Notificacion {
	private String _mensaje;
	private String _emailDestinatario;
	private String _emailRemitente;
	private Integer _celularDestinatario;
	private Integer _celularRemitente;
	
	Notificacion (String mensaje, String emailDestinatario, String emailRemitente, Integer celularDestinatario, Integer celularRemitente) {
		_mensaje = mensaje;
		_emailDestinatario = emailDestinatario;
		_emailRemitente = emailRemitente;
		_celularDestinatario = celularDestinatario;
		_celularRemitente = celularRemitente;
	}

}
