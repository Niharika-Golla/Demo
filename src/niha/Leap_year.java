package niha;
import java.util.*;
public class Leap_year {

	public static void main(String[] args) {

Scanner year = new Scanner (System.in);
System.out.print("Enter year:");
int leapyear = year.nextInt();
	
if((leapyear % 4 == 0 && leapyear % 100 != 0)  || leapyear % 400 == 0) {
	System.out.print(leapyear+" is a leap year");
}	
else {
	System.out.print(leapyear+" is not a leap year");
}
}
}
