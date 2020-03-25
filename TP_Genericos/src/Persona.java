
public class Persona implements Comparable, ICopy{

	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}


	@Override
	public int compareTo(Object o) {
		int result=1;
		Persona p = (Persona) o;
		
		if(p.edad<this.edad) {
			result=-1;
		}
		if(p.edad==this.edad) {
			result=0;
		}
		return result;
	}


	@Override
	public void copy(Object value) {
		Persona persona = (Persona) value;
		this.edad=persona.edad;
		this.nombre=persona.nombre;
	}
	

}
