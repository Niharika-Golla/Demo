package TUTORIALS;
import java.util.Scanner;
public class variables {

	public static void main(String[] args) {
	/*	Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number:");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter the second number:");
		int num2 = scanner.nextInt();
		
		System.out.println("Enter the third number:");
		int num3 = scanner.nextInt();
		
		
		int max = num1;
		

		 if(num2 > num1) {
			max = num2;
		} 
		 else if(num3 > max) {
		 max = num3;
		}
		 
		 System.out.println("The maximum number is " + max);
	}
}
		int a =32;
		int b = 23;
		
		 a = a + b;
		 b = a - b;
		 a = a - b;
		
		System.out.println(a);
		System.out.println(b);
		
	}}
		
Scanner scanner =  new Scanner(System.in);

		System.out.println("Enter miles:");
		double miles = scanner.nextDouble();
		double km = miles / 1.6;
		System.out.println(miles + " miles is euals to " + km +"km");
		System.out.println("Enter km:");
		 km =scanner.nextInt();
	     miles = km * 1.6;
	     System.out.println(km + " is equal to "+ miles + " miles");
	
	}
	
}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year:");
		int year = scanner.nextInt();
		
		if(year % 4 == 0 || (year % 100 != 0 && year % 400 == 0)) {
			System.out.println(year + " is a leap year.");
		}
		else {
			System.out.println(year + " is not a leap year");
		}
	}}
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your percentage:");
		int percentage = scanner.nextInt();
		char Grade ='A';
		if(percentage >= 90) {
			Grade = 'A';
		}
		else if(percentage >=80 ) {
			Grade = 'B';
		}
		else if (percentage >= 70 ) {
			Grade ='C';
		}
		else if (percentage >= 60) {
			Grade='D';
		}
		else if (percentage >= 50) {
			Grade = 'E';
		}
		else if (percentage <= 40){
			Grade = 'F';
		}
		
		System.out.println("Your grade is " + Grade);
		
	}
}	

		
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number of your choice:");
int num= scanner.nextInt();
if (num % 5 == 0) {
	System.out.println(num + " is divisible by 5");
}
else {
	System.out.println(num + " is not divisible  by 5");
}




	}
}

		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number you want to verify :");
		int buzz = scanner.nextInt();
		if(buzz % 7 == 0 || buzz % 10 == 7) {
			System.out.println(buzz + " is a buz number.");
		}
		else {
			System.out.println(buzz + " is not a buzz number");
		}
		
	}
}
*/
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a non-negative integer to calculate its factorial: ");
		int n = scanner.nextInt();
		
		if (n < 0) {
		    System.out.println("Factorial is not defined for negative numbers.");
		} else {
		    long factorial = calculateFactorial(n);
		    System.out.println("Factorial of " + n + " is: " + factorial);
		        }
		
		        scanner.close();
		    }
		
		    public static long calculateFactorial(int n) {
		        if (n == 0 || n == 1) {
		            return 1;
		        } else {
		            long factorial = 1;
		            for (int i = 2; i <= n; i++) {
		                factorial *= i;
		            }
		            return factorial;
		        }
		    }
		}























