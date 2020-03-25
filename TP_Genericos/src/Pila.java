
public class Pila<T> {

	private Nodo<T> first;
	
	public Pila(Nodo<T> first) 
	{
		this.first=first;
	}
	
	public void push(T value) {
		Nodo<T> actual=this.first;
		while(actual.getNext()!=null) {
			actual= actual.getNext();
		}
		actual.setNext(new Nodo<T>(value));
	}
	
	public T pop() {
		Nodo<T> ant=null;
		Nodo<T> actual=this.first;
		while(actual.getNext()!=null) {
			ant=actual;
			actual= actual.getNext();
		}
		
		T result=actual.getValue();
		actual=ant;
		actual.setNext(null);
		
		return result;
	}
	
	public int size() {
		int result= 1;
		Nodo<T> actual=this.first;
		while(actual.getNext()!=null) {
			actual= actual.getNext();
			result++;
		}
		return result;
	}
	
	public void showValues() {
		Nodo<T> actual=this.first;
		while(actual.getNext()!=null) {
			System.out.println(actual.getValue());
			actual= actual.getNext();
		}
		System.out.println(actual.getValue());
	}

}
