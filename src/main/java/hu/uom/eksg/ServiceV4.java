package hu.uom.eksg;

public class ServiceV4 {
	
	private final Feature feature = new BestFeature();
	
	public void doPrice() {
		System.out.println(feature.calculatePrice());
	}
}
