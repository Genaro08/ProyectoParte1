
public class Mascota {
	private String nombre;
	private Persona duenio;
	
	public Mascota(String nombre){
		this.nombre = nombre;
		duenio = null;
	}
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setDuenio(Persona duenio){
		this.duenio = duenio;
	}
	
	public Persona getDuenio(){
		return duenio;
	}
	
}
