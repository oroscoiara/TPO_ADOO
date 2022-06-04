package Clases.Administracion.Facturacion;

import Clases.Administracion.Facturacion.Gasto;

import java.sql.Date;

public class Comun extends Gasto {


    Comun(Expensa expensa, float total, Date fecha, String nombre) {
        super(expensa, total, fecha, nombre);
    }
}
