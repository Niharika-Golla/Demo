package TUTORIALS;
import java.util.Scanner;



class MemeTeam {
    String arr[] = new String[2];

    void Method1() {
        Scanner array = new Scanner(System.in);
        System.out.println("Enter the elements into array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array.next();
        }
        array.close();
    }

    void Method2() {
        System.out.print("Array elements are: \n{");
        for (String meme : arr) {
            System.out.print(meme + ",");
        }
        System.out.println("}");
    }
}

public class Classes {
    public static void main(String args[]) {
      
        MemeTeam obj1 = new MemeTeam();
        obj1.Method1();
        obj1.Method2();
    }
}
