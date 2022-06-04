package Clases.Administracion.Facturacion;

import Clases.Administracion.Criterio;
import Clases.Edificios.UnidadFuncional;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class Expensa {
	private float _total;
	private boolean _status;
	private Criterio _criterio;
	private String _detalle;
	private Date _periodo;
	private TipoExpensa _tipo;
	private List<Gasto> _gastos;
	private UnidadFuncional _unidadFuncional;
	
	Expensa(float total, boolean status, Criterio criterio, String detalle, UnidadFuncional unidadFuncional, Date periodo, TipoExpensa tipo){
		_total = total;
		_status = status;
		_criterio = criterio;
		_detalle = detalle;
		_periodo = periodo;
		_tipo = tipo;
		_gastos = new ArrayList <Gasto>();
		_unidadFuncional = unidadFuncional;
		
	}
}

