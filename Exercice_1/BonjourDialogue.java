package Exercice_1;
import javax.swing.*;

public class BonjourDialogue {
    public static void main(String[] args) {
        String nom = JOptionPane.showInputDialog("Enter your name:");

        if (nom != null && !nom.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Hello " + nom + "!");
        } else {
            JOptionPane.showMessageDialog(null, "You didn't enter a name.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
