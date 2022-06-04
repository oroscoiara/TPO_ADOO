package Clases.Administracion.Facturacion;

import Clases.Personas.Persona;

import java.sql.Date;

public class Factura {
	private Date _fechaPago;
	private boolean _estaPago;
	private Persona _pagadoPor;
	private float _montoOrdinario;
	private float _total;
	
	Factura (Date fechaPago, boolean estaPago, Persona pagadoPor, float montoOrdinario, float total){
		_fechaPago = fechaPago;
		_estaPago = estaPago;
		_pagadoPor = pagadoPor;
		_montoOrdinario = montoOrdinario;
		_total = total;
	}
	

}
