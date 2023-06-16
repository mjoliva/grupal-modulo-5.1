package modelo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Capacitacion {
	private int idCapacitacion;		
	private String rutCliente;					
	private String dia;
	private LocalDate fecha;
	private LocalTime hora;
	private String lugar;
	private float duracion;
	private int asistentes;
	
	public Capacitacion() {
		
	}

	public Capacitacion(String rutCliente, String dia, LocalDate fecha, LocalTime hora, String lugar, float duracion,
			int asistentes) {
		super();
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.fecha = fecha;
		this.hora = hora;
		this.lugar = lugar;
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

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public float getDuracion() {
		return duracion;
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

	public int getIdCapacitacion() {
		return idCapacitacion;
	}
	
	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", fecha=" + fecha + ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion
				+ ", asistentes=" + asistentes + "]";
	}
	
}
