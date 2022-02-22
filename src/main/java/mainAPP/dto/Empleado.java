package mainAPP.dto;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "empleado")
public class Empleado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String apellido;
	private String direccion;
	private int DNI;
	private LocalDate fecha;
	private String trabajo;

	// CONTRUCTORES
	public Empleado() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param direccion
	 * @param DNI
	 * @param fecha
	 * @param trabajo
	 */
	
	public Empleado(Long id, String nombre, String apellido, String direccion, int DNI, LocalDate fecha,
			String trabajo) {
		
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.DNI = DNI;
		this.fecha = fecha;
		this.trabajo = trabajo;
	}

	// GETTERS Y SETTERS
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getDNI() {
		return DNI;
	}

	public void setDNI(int DNI) {
		this.DNI = DNI;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	// METODO TO STRING
	@Override
	public String toString() {
		return "Empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion
				+ ", DNI=" + DNI + ", fecha=" + fecha + ", trabajo=" + trabajo + "]";
	}
}
