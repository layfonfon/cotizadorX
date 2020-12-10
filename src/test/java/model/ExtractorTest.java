package model;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ExtractorTest {

	@Test
	public void testUno() {
		
		ArrayList<Dato> datos = new ArrayList<Dato>();
		
		Extractor extractor = new Extractor(" ", datos);
		
		extractor.extraer();
		
		assertEquals(datos.get(0).getNombre(), "toalla");		
		
		
	}

}
