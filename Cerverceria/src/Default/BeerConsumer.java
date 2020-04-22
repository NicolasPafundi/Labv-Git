package Default;

public class BeerConsumer implements Runnable{
	private BeerHouse beerHouse;
	private String name;
	
	public BeerConsumer(BeerHouse beerHouse, String name) {
		this.beerHouse=beerHouse;
		this.name=name;
	}
	
	@Override
	public void run() {
		while(beerHouse.getStock()!=0 || beerHouse.getAvailable()!=0) {
			try {
				beerHouse.Consume(name);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Lo siento "+ name +". Se llego al limite de 100 cervezas producidas y todas fueron consumidas");
	}
}
