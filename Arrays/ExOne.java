package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ExOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notes = new double[10];

        // Collect notes from user input with validation
        for (int i = 0; i < notes.length; i++) {
            double note;
            do {
                System.out.print("Enter note " + (i + 1) + " (between 0 and 20): ");
                note = scanner.nextDouble();
                if (note < 0 || note > 20) {
                    System.out.println("Invalid note! Please enter a value between 0 and 20.");
                }
            } while (note < 0 || note > 20);
            notes[i] = note;
        }

        // Display notes without sorting
        System.out.println("\nList of notes without sorting:");
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Note " + (i + 1) + ": " + notes[i]);
        }

        // Sort and display notes
        Arrays.sort(notes);
        System.out.println("\nList of notes after sorting:");
        for (int i = 0; i < notes.length; i++) {
            System.out.println("Note " + (i + 1) + ": " + notes[i]);
        }

        // Calculate and display the sum of notes
        double sum = 0;
        for (double note : notes) {
            sum += note;
        }
        System.out.println("\nSum of notes: " + sum);

        // Calculate and display the average of notes
        double avg = sum / notes.length;
        System.out.println("Average of notes: " + avg);

        scanner.close();
    }
}
