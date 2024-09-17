package Exercise;

class Vehicle {
	void v1() {
		System.out.println("There are different means of transportation");
	}
}

class Cars extends Vehicle{
	void v2() {
		System.out.println("Cars are the one of the most common means of transport");
	}
}

class SportsCar extends Cars{
	void v3() {
		System.out.println("Sports car are used for car races");
	}
}
public class Transports {
	public static void main(String args[]) {
		SportsCar Sc =new SportsCar();
		Sc.v1();
		Sc.v2();
		Sc.v3();

	}

}
