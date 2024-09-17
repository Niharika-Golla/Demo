package Exercise;

class pets {
void eat() {
	System.out.println("Pets eat food ");
}
void sleep() {
	System.out.println("A pet loves to sleep with its owner ");
}


}
class dog extends pets {
	void sound() {
		System.out.println("Dogs bark");
	}
} 


public class animals {
	public static void main(String args[]) {
		dog Dog = new dog();
		Dog.sound();
		Dog.eat();
		Dog.sleep();
		
	}
}