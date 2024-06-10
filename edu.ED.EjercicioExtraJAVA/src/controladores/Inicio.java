package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.PropietarioDto;
import dtos.VehiculoDto;
import servicios.FicherosImplementacion;
import servicios.FicherosInterfaz;

/** Clase principal de nuestra aplicacion */
public class Inicio {

	public static final String rutaArchivo = "C:\\Users\\Carlo\\OneDrive\\Escritorio\\FICHEROS\\EjercicioExtraJava\\vehiculosypropietarios";
	public static final List<PropietarioDto> listaPropietarios = new ArrayList<PropietarioDto>();
	public static final List<VehiculoDto> listaVehiculos = new ArrayList<VehiculoDto>();

	/** Metodo principal de entrada de nuestra aplicaccion */
	public static void main(String[] args) {

		FicherosInterfaz fi = new FicherosImplementacion();

		fi.leerFichero();

		for (VehiculoDto vehiculo : Inicio.listaVehiculos) {

			System.out.println(vehiculo);

		}
		for (PropietarioDto propietario : Inicio.listaPropietarios) {

			System.out.println(propietario);

		}

	}

}
