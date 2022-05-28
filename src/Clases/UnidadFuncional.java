package Clases;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class UnidadFuncional {
	private float _metrosCuadrados;
	private TipoUnidad _tipo;
	private List<Persona> _due�os;
	private List<Persona> _inquilinos;
	private List<Factura> _facturas;
	private Date _vencimiento;
	private float _porcentaje;

	UnidadFuncional(float metrosCuadrados, TipoUnidad tipo, Date vencimiento, float porcentaje){
		_metrosCuadrados = metrosCuadrados;
		_tipo = tipo;
		_due�os = new ArrayList<Persona>();
		_inquilinos = new ArrayList<Persona>();
		_facturas = new ArrayList<Factura>();
		_vencimiento = vencimiento;
		_porcentaje = porcentaje;	
		
	}
}
