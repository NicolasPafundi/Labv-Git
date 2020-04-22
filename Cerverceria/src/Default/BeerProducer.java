package Default;

public class BeerProducer implements Runnable{
	private BeerHouse beerHouse;
	
	public BeerProducer(BeerHouse beerHouse) {
		this.beerHouse=beerHouse;
	}
	
	@Override
	public void run() {
		while(beerHouse.getStock()!=0) {
			try {
				beerHouse.Produce();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
