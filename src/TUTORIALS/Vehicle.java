package TUTORIALS;

class Car {
	String model = "Toyoto";
	String color = "Red";

}
public class Vehicle{
	public static void main(String args[]) {
		Car obj = new Car();
		System.out.println("He bought a "+obj.color + " car of " + obj.model );
	}
}