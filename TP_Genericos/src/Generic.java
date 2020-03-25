import java.awt.List;
import java.util.ArrayList;

public class Generic <T extends Copy & Comparable>{

	private ArrayList<T> list;
	
	public Generic() 
	{
		this.list= new ArrayList<T>();
	}
	
	public void add(T valor) {
		this.list.add(valor);
	}
	public boolean remove(T valor) {
		return this.list.remove(valor);
	}
	public boolean exist(T valor) {
		return list.contains(valor);
	}
	public T getMax() {
		this.list.sort(null);
		return this.list.get(0);
	}
	public T getMin() {
		this.list.sort(null);
		int last=this.list.size()-1;
		return this.list.get(last);
	}
	
	public void removeLast(T value) {
		int last=this.list.size()-1;
		T clone=this.list.get(last);
		value.copy(clone);
		this.list.remove(last);
	}
}
