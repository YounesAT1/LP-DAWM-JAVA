package Exercice_2;

public class TestLivre {
    public static void main(String[] args) {
        // Create the first book
        Livre livreOne = new Livre( );
        livreOne.setAuteur("Horstman");
        livreOne.setTitre("Au Cœur de Java : Notions Fondamentales");
        livreOne.setNombreDePage(820);

        // Create the second book
        Livre livreTwo = new Livre("Richard Monson-Haefel", "Entreprise Java Bean");
        livreTwo.setNombreDePage(568);

        // Create the third book
        Livre livreThree = new Livre("Horstman", "Au Cœur de Java : Fonctions Avancées", 950);

        // Print the first book's details using toString()
        System.out.println(livreOne); // Implicit call to toString()
        System.out.println(livreOne.toString()); // Explicit call to toString()

        // Compare the number of pages for the first two books
        String comparisonResult = livreOne.plusVolumineuxQue(livreTwo)
                ? "The book \"" + livreOne.getTitre() + "\" has more pages than the book \"" + livreTwo.getTitre() + "\"."
                : "The book \"" + livreTwo.getTitre() + "\" has more pages than the book \"" + livreOne.getTitre() + "\".";

        System.out.println(comparisonResult);

        // Compare the number of pages for the first and third books using the static method
        String comparisonResultWithStaticMethod = Livre.plusVolumineuxQue(livreOne, livreThree)
                ? "The book \"" + livreOne.getTitre() + "\" has more pages than the book \"" + livreThree.getTitre() + "\"."
                : "The book \"" + livreThree.getTitre() + "\" has more pages than the book \"" + livreOne.getTitre() + "\".";
        System.out.println(comparisonResultWithStaticMethod);

        // Check if Livre one has the same author as Livre two (instance method)
        boolean sameAuthorOneTwo = livreOne.aMemeAuteurQue(livreTwo);
        System.out.println(sameAuthorOneTwo
                ? "Livre One and Livre Two have the same author."
                : "Livre One and Livre Two do not have the same author.");

        // Check if Livre one has the same author as Livre three (static method)
        boolean sameAuthorOneThree = Livre.aMemeAuteurQue(livreOne, livreThree);
        System.out.println(sameAuthorOneThree
                ? "Livre One and Livre Three have the same author."
                : "Livre One and Livre Three do not have the same author.");


        // Assuming the Livre class has a method getNombreDePages()
        int pagesLivreOne = livreOne.getNombreDePage();
        int pagesLivreTwo = livreTwo.getNombreDePage();

        int totalPages = pagesLivreOne + pagesLivreTwo;

        System.out.println("La somme des nombres de pages des deux premiers livres est : " + totalPages);

    }
}
