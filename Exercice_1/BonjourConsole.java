package Exercice_1;
import java.util.Scanner;

public class BonjourConsole {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you name : ");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name);
        scanner.close();
    }
}
