public class Persona {
	private String Nombre;
	private Mascota mascota;
	
	public Persona(String n){
		Nombre = n;
		mascota = null;
	}
	
	public void setNombre(String n){
		Nombre = n;
	}
	
	public String getNombre(){
		return Nombre;
	}
	
	public void setMascota(Mascota mascota){
		this.mascota = mascota;
	}
	
	public Mascota getMascota(){
		return mascota;
	}
}
