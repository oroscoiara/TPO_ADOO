package Clases.Administracion.Facturacion;

import java.sql.Date;

public class Gasto {
	private Expensa _expensa;
	private float _total;
	private Date _fecha;
	private String _nombre;

	Gasto(Expensa expensa, float total, Date fecha, String nombre){
		_expensa = expensa;
		_total = total;
		_fecha = fecha;
		_nombre = nombre;

}
}