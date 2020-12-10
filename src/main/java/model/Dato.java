package model;

public class Dato {

	String nombre, descripcion, rutaImg;
	float precio;

	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	
	public void setPrecio(float precio){
		this.precio= precio;
	}
	
	public void setRutaImg(String ruta){
		rutaImg= ruta;
	}
		
	public String getNombre(){
		return nombre;
	}
	
	public String getDescripcion(){
		return descripcion;
	}
	
	public float getPrecio(){
		return precio;
	}
	
	public String getRutaImg(){
		return rutaImg;
	}
	
	
}
