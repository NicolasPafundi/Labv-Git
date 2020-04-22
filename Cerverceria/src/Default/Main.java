package Default;

public class Main {

	public static void main(String[] args) {
		BeerHouse beerHouse= new BeerHouse();
		Thread beerProducer= new Thread(new BeerProducer(beerHouse));
		Thread beerConsumer1= new Thread(new BeerConsumer(beerHouse,"Juan"));
		Thread beerConsumer2= new Thread(new BeerConsumer(beerHouse,"Pedro"));
		Thread beerConsumer3= new Thread(new BeerConsumer(beerHouse,"Luis"));
		
		beerProducer.start();
		beerConsumer1.start();
		beerConsumer2.start();
		beerConsumer3.start();
	}

}
