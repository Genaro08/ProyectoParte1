public class Tester {
	public static void main(String[] args) {
		Persona sujeto1 = new Persona("Naruto");
		Mascota mascota1 = new Mascota("Pakkun");
		sujeto1.setMascota(mascota1);
		System.out.println("El nombre del sujeto 1 es "+sujeto1.getNombre()+" y su mascota es "+sujeto1.getMascota().getNombre());
	}
}
