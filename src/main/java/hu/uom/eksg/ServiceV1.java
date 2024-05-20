package hu.uom.eksg;

public class ServiceV1 {
	
	private final Feature feature = new BasicFeature();
	
	public void calculate() {
		System.out.println(feature.calculatePrice());
	}
}
