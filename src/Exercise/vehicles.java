package Exercise;
class car{
	String model;
	String color;
	
	
	car(String model,String color){
	this.model = model;
	this.color = color;
	}
	void display() {
		System.out.println("Model: " + model);
		System.out.println("Color: " + color);
	}
}

public class vehicles{
	public static void main (String args[]) {
		car car1 = new car("Toyoto","Black");
		car car2 = new car("Audi","Grey");
		
		System.out.println("Car1 : ");
		car1.display();
		
		System.out.println("\nCar2:");
		car2.display();
		
	}
}