package dtos;

import java.time.LocalDate;

public class VehiculoDto {

	long idVehiculo;
	String matricula = "aaaaa";
	boolean esHistorico = false;
	LocalDate fechaMatriculacion;
	
	
	
	public long getIdVehiculo() {
		return idVehiculo;
	}
	public void setIdVehiculo(long idVehiculo) {
		this.idVehiculo = idVehiculo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public boolean isEsHistorico() {
		return esHistorico;
	}
	public void setEsHistorico(boolean esHistorico) {
		this.esHistorico = esHistorico;
	}
	public LocalDate getFechaMatriculacion() {
		return fechaMatriculacion;
	}
	public void setFechaMatriculacion(LocalDate fechaMatriculacion) {
		this.fechaMatriculacion = fechaMatriculacion;
	}
	
	
	
	
	public VehiculoDto(long idVehiculo, String matricula, boolean esHistorico, LocalDate fechaMatriculacion) {
		super();
		this.idVehiculo = idVehiculo;
		this.matricula = matricula;
		this.esHistorico = esHistorico;
		this.fechaMatriculacion = fechaMatriculacion;
	}
	
	
	public VehiculoDto() {
		super();
	}
	
	
	
	
	
}
