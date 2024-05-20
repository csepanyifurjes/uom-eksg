package hu.uom.eksg;

public class Program {

	public static void main(String[] args) {

		final ServiceV1 service1 = new ServiceV1();
		final ServiceV2 service2 = new ServiceV2();

		service1.calculate();
		service2.generatePrice();

	}
}
