package niha;
import java.util.Scanner;

public class decimal_binary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a binary number: ");
        String binary = scanner.nextLine();
        int decimalFromBinary = Integer.parseInt(binary, 2);
        System.out.println("Binary to Decimal: " + decimalFromBinary);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();
        String binaryFromDecimal = Integer.toBinaryString(decimal);
        System.out.println("Decimal to Binary: " + binaryFromDecimal);

        scanner.close();
    }
}