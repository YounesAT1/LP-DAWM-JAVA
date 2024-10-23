package Exercice_3;

import java.util.Scanner;

public class ManipuleString {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // Q-A
        int number = 123;
        String stringNumber = String.valueOf(number);
        System.out.println(stringNumber);

        // Q-B
        System.out.print("Enter a string value : ");
        String stringValue = scanner.nextLine();
        String stringValuesWithoutSpaces = stringValue.replace(" ","");
        String stringValuesWithoutSpacesUpperCased = stringValuesWithoutSpaces.toUpperCase();
        System.out.println(stringValuesWithoutSpacesUpperCased);

        // Q-C
        System.out.print("Enter the value of the first string  : ");
        String firstString = scanner.nextLine();
        System.out.print("Enter the value of the second string : ");
        String secondString = scanner.nextLine();

        if (firstString.isEmpty() || secondString.isEmpty()) {
            System.out.println("One of the string values is empty.");
            return;
        }

        String message = (firstString.charAt(0) == secondString.charAt(0)) ?
                "Both strings start with the same character." :
                "The strings do not start with the same character.";

        System.out.println(message);

        // Q-D
        System.out.print("Enter the value of the first string : ");
        String stringOne = scanner.nextLine();
        System.out.print("Enter the value of the second string : ");
        String stringTwo = scanner.nextLine();

        System.out.println("string one == string two : " + (stringOne == stringTwo));
        System.out.println("stringOne.equals(stringTwo): " + stringOne.equals(stringOne));
        System.out.println("stringOne.compareTo(stringTwo): " + stringOne.compareTo(stringTwo));
        System.out.println("stringOne.compareToIgnoreCase(stringTwo): " + stringOne.compareToIgnoreCase(stringTwo));

        // Q-E
        System.out.print("Enter the value of the first string : ");
        String valueOne = scanner.nextLine();
        System.out.print("Enter the value of the second string : ");
        String valueTwo = scanner.nextLine();

        boolean startsWith = valueOne.startsWith(valueTwo);
        System.out.println("Does valueOne starts with valueTwo : "+startsWith);

        boolean endsWith = valueOne.endsWith(valueTwo);
        System.out.println("Does valueOne ends with valueTwo : "+endsWith);

        boolean contains = valueOne.contains(valueTwo);
        System.out.println("Does valueOne contains valueTwo : "+contains);

        // Q-F
        System.out.print("Enter the value of the first string : ");
        String firstValue = scanner.nextLine();
        System.out.print("Enter the value of the second string : ");
        String secondValue = scanner.nextLine();

        if (firstValue.contains(secondValue)) {
            int startIndex = firstValue.indexOf(secondValue);
            String result = firstValue.substring(0,startIndex) + firstValue.substring(startIndex + secondValue   .length());

            System.out.println("The first value without the second value : "+result);
        }else {
            System.out.println("The first value doesn't contain the second value, So the result is  : "+firstValue);
        }
    }
}
