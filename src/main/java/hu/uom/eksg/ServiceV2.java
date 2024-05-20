package hu.uom.eksg;

public class ServiceV2 {
	
	private final Feature feature = new BasicFeature();
	
	public void generatePrice() {
		System.out.println(feature.calculatePrice());
	}

}
