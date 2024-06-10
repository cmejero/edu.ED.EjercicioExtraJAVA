package servicios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;

import dtos.PropietarioDto;
import dtos.VehiculoDto;
import controladores.Inicio;


/** clase que se necarga de implementar a fichero interfaz */
public class FicherosImplementacion implements FicherosInterfaz {

	public void leerFichero() {

		File archivo;

		BufferedReader bf;

		try {

			archivo = new File(Inicio.rutaArchivo);
			bf = new BufferedReader(new FileReader(archivo));

			String lineas = "";

			while ((lineas = bf.readLine()) != null) {

				String[] linea = lineas.split(";");

				PropietarioDto propietario = new PropietarioDto();
				propietario.setId(crearIdPropietario());
				propietario.setDni(linea[2]);
				String fechaCom = linea[3];
				LocalDate fechaCompra = LocalDate.parse(fechaCom);
				propietario.setFechaCompra(fechaCompra);
				propietario.setMatricula(linea[0]);

				Inicio.listaPropietarios.add(propietario);

				VehiculoDto vehiculo = new VehiculoDto();

				vehiculo.setIdVehiculo(crearIdVehiculo());
				vehiculo.setMatricula(linea[0]);
				String fechaMa = linea[1];
				LocalDate fechaMatriculacion = LocalDate.parse(fechaMa);
				vehiculo.setFechaMatriculacion(fechaMatriculacion);

				Inicio.listaVehiculos.add(vehiculo);
			}

		} catch (IOException io) {

		}

	}

	/** Metodo que se encarga de generar un Id */
	private long crearIdPropietario() {

		long nuevoId;
		int tamanioLista = Inicio.listaPropietarios.size();

		if (tamanioLista > 0) {

			nuevoId = Inicio.listaPropietarios.get(tamanioLista - 1).getId() + 1;

		} else {

			nuevoId = 1;
		}
		return nuevoId;

	}

	/** Metodo que se encarga de generar un Id */
	private long crearIdVehiculo() {

		long nuevoId;
		int tamanioLista = Inicio.listaVehiculos.size();

		if (tamanioLista > 0) {

			nuevoId = Inicio.listaVehiculos.get(tamanioLista - 1).getIdVehiculo() + 1;

		} else {

			nuevoId = 1;
		}
		return nuevoId;

	}

}
