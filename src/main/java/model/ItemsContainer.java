package model;
import java.util.ArrayList;

public class ItemsContainer {

	ArrayList<Datos> datos;
		
	public ItemsContainer() {
	
		datos = new ArrayList<Datos>();
		
	}
	
	public void extraer(String rutaDeArchivo) {

		Extractor extractor = new Extractor(rutaDeArchivo, datos);
		
		
		
		
		
	}

}
