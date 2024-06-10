package dtos;

import java.time.LocalDate;

public class PropietarioDto {
	
	
	long id;
	String dni = "aaaaa";
	LocalDate fechaCompra;
	String matricula = "aaaaa";

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public LocalDate getFechaCompra() {
		return fechaCompra;
	}
	public void setFechaCompra(LocalDate fechaCompra) {
		this.fechaCompra = fechaCompra;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
	
	public PropietarioDto(long id, String dni, LocalDate fechaCompra, String matricula) {
		super();
		this.id = id;
		this.dni = dni;
		this.fechaCompra = fechaCompra;
		this.matricula = matricula;
	}
	
	
	public PropietarioDto() {
		super();
	}
	
	
	
	
	
}
