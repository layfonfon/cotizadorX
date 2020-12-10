package model;

import java.util.ArrayList;

public class Extractor {

	ArrayList<Dato> datos;
	
	public Extractor(String ruta, ArrayList<Dato> datos) {	
		this.datos = datos;
	}
	
	public void extraer() {

		Dato d = new Dato();
		d.setDescripcion("a");
		d.setNombre("toalla");
		d.setPrecio(2.54f);
		d.setRutaImg("sa.jpg");
		
		datos.add(d);
		
		System.out.println(datos.size());
	}
}
