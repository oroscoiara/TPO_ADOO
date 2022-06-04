package Clases.Administracion.Facturacion;

import java.sql.Date;

public class Recurrente extends Gasto {
	private Integer _frecuencia;
	private Date _fecha_fin;

	Recurrente(Expensa expensa, float total, Date fecha, String nombre, Integer frecuencia, Date fecha_fin) {
		super(expensa, total, fecha, nombre);
		_frecuencia = frecuencia;
		_fecha_fin = fecha_fin;
		// TODO Auto-generated constructor stub
	}

}
