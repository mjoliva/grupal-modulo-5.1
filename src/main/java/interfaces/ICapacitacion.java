package interfaces;

import java.util.ArrayList;

import modelo.Capacitacion;

public interface ICapacitacion {

	/**
	 * listar capacitaciones
	 */
	public ArrayList<Capacitacion> listarCapacitaciones(  );
	
	/**
	 * Agregar una capacitacion a listado 
	 */
	public void registraCapacitacion(Capacitacion c);
}
