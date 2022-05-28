package Clases;

import java.util.ArrayList;
import java.util.List;

import Interfaces.IEnviarNotificacion;

public class Consorcio {
	private IEnviarNotificacion _enviarNotificacion;
	private String _nombre;
	private List<UnidadFuncional> _unidadesFuncionales;
	private List<Gasto> _gastos;
	private Criterio _criterio;
	private CuentaBancaria _cuentaBancaria;
	
	Consorcio (IEnviarNotificacion enviarNotificacion, String nombre, Criterio criterio, CuentaBancaria cuentaBancaria) {
		_enviarNotificacion = enviarNotificacion;
		_nombre = nombre;
		_unidadesFuncionales = new ArrayList <UnidadFuncional>();
		_gastos = new ArrayList <Gasto>();
		_criterio = criterio;
		_cuentaBancaria = cuentaBancaria;
		

		
	}
	

}
