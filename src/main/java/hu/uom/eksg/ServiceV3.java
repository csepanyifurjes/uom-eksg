package hu.uom.eksg;

public class ServiceV3 {
	
	private final Feature feature = new BetterFeature();
	
	public void makePrice() {
		System.out.println(feature.calculatePrice());
	}
}
