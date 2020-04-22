package Default;

public class BeerHouse {
	private int Stock;
	private int Available;
	
	public BeerHouse() {
		Stock = 5;
		Available=0;
	}
	
	public int getStock() {
		return Stock;
	}

	public int getAvailable() {
		return Available;
	}

	public synchronized void Produce() throws InterruptedException {
		while(Stock==0 && Available!=0) {
			wait();
		}
		if(Stock!=0){
			Stock--;
			Available++;
			System.out.println("Se produjo 1 cerveza. Disponibles = "+getAvailable()+" Stock = " + getStock());
			notifyAll();
		}
	}
	
	public synchronized void Consume(String name)throws InterruptedException {
		while(Available==0 && Stock!=0) {
			wait();
		}
		if(Available==0) {
			notifyAll();
		}else {
			Available--;
			System.out.println(name+" consumio 1 cerveza. Disponibles = "+getAvailable()+" Stsock = " + getStock());
			notifyAll();
		}
	}
}
