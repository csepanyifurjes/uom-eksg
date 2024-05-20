package hu.uom.eksg;

public class Program {

	public static void main(String[] args) {

		ServiceV1 service1 = new ServiceV1();
		ServiceV2 service2 = new ServiceV2();
		ServiceV3 service3 = new ServiceV3();

		service1.calculate();
		service2.generatePrice();
		service3.makePrice();

	}
}
