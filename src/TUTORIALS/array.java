package TUTORIALS;

import java.util.Scanner;

public class array {
    static String arr[] = new String[4];

    static void Methodd() {
        Scanner array = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = array.next();
        }
        array.close();
    }

    public static void main(String[] args) {
        System.out.print("Enter the names of your family members:\n");
        array.Methodd();
        System.out.print("Your family members are: \n{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}
