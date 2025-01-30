ACSII
import java.util.Scanner;
public class SimpleAsciiValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0); 
        System.out.println("The ASCII value of '" + inputChar + "' is: " + (int) inputChar);
        scanner.close();
    }
}
