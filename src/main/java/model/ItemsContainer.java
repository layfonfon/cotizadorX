package model;
import java.util.ArrayList;

public class ItemsContainer {

	ArrayList<Dato> datos;
		
	public ItemsContainer() {
	
		datos = new ArrayList<Dato>();
		
	}
	
	public void extraer(String rutaDeArchivo) {

		Extractor extractor = new Extractor(rutaDeArchivo, datos);
		
				
		
	}

}
