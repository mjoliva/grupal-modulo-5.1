package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Capacitacion {
	private String idCapacitacion;		
	private String rutCliente;					
	private String dia;
	private LocalDate fecha;
	private LocalTime hora;
	private float duracion;
	private int asistentes;

	
	public Capacitacion() {

	}

	public Capacitacion(String idCapacitacion, String rutCliente, String dia, LocalDate fecha, LocalTime hora,
			float duracion, int asistentes) {
		
		this.idCapacitacion = idCapacitacion;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.fecha = fecha;
		this.hora = hora;
		this.duracion = duracion;
		this.asistentes = asistentes;
	}

	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public float getDuracion() {
		return duracion;
	}

	public void setIdCapacitacion(String idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public void setDuracion(float duracion) {
		this.duracion = duracion;
	}

	public int getAsistentes() {
		return asistentes;
	}

	public void setAsistentes(int asistentes) {
		this.asistentes = asistentes;
	}

	public String getIdCapacitacion() {
		return idCapacitacion;
	}

	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", fecha=" + fecha + ", hora=" + hora + ", duracion=" + duracion + ", asistentes=" + asistentes + "]";
	}
}
