public class Main {

	public static void main(String[] args) {

		Persona persona2=new Persona("lucas",31);
		Persona persona1=new Persona("nico",25);
		Persona persona3=new Persona("sergio",50);
		
		Generic<Persona> list=new Generic<Persona>();
		
		list.add(persona1);
		list.add(persona2);
		list.add(persona3);

		System.out.println("Menor = "+list.getMin().toString());
		System.out.println("Mayor = "+list.getMax().toString());
		
		Persona persona = new Persona("",0);
		list.removeLast(persona);
		System.out.println("Removido ="+persona.toString());
		
		Nodo<Persona> primerNodo= new Nodo(persona1);
		Pila pila = new Pila(primerNodo);
		
		pila.push(persona2);
		pila.push(persona3);
		
		System.out.println(pila.pop());
		System.out.println(pila.size());
		pila.showValues();
	}

}
