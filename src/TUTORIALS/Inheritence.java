

package TUTORIALS;
import java.util.Scanner;

class A{
	
	String arr[]= new String[5];

	
	void Method1() {
		arr[0] = "Kavya";
		arr[1] = "Niha";
		arr[2] = "Chaitu";
		arr[3] = "Mouni";
		arr[4] = "Harsi";
		
		
		System.out.println("Enter your name");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();

		
		boolean found = false;
		for(int i=0;i<5;i++) {
		if(name.equals(arr[i])) {
				System.out.println("Welcome to Meme Team");
				found = true; 
				break;
			}
		}
		
			if(!found) {
				System.out.println("Hello stranger");
			}
		}
	}
	


class B extends A{
	int age = 19;
}

class C extends B{
	String branch = "CSE";
}

public class Inheritence {
public static void main(String[] args) {
       C obj = new C();
       obj.Method1();
	}

}
