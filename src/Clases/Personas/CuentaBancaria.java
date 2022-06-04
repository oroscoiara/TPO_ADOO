package Clases.Personas;

public class CuentaBancaria {
	private Integer _nroCuenta;
	private float _saldo;
	private Integer _cbu;
	private Integer _tokenSeguridad;
	
	CuentaBancaria(Integer nroCuenta, float saldo, Integer cbu, Integer tokenSeguridad) {
		_nroCuenta = nroCuenta;
		_saldo = saldo;
		_cbu = cbu;
		_tokenSeguridad = tokenSeguridad;
	}

}
