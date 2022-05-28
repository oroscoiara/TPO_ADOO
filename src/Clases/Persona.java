package Clases;

public abstract class Persona {
	private String _nombre;
	private String _apellido;
	private Integer _DNI;
	private String _domicilio;
	private String _tipoNotificacion;
	private Integer _celular;
	private String _email;
	
	Persona (String nombre, String apellido, Integer DNI, String domicilio, String tipoNotificacion, Integer celular, String email){
		_nombre = nombre;
		_apellido = apellido;
		_DNI = DNI;
		_domicilio = domicilio;
		_tipoNotificacion = tipoNotificacion;
		_celular = celular;
		_email = email;
				
	}

}
