package Exercice_2;

public class Livre {

    // ATTRIBUTES
    private String titre;
    private String auteur;
    private int nombreDePage;

    // DEFAULT CONSTRUCTOR
    public  Livre() {
        this.auteur = "Inconnu";
        this.titre = "Sans titre";
        this.nombreDePage = 1;
    }

    // CONSTRUCTOR WITH AUTHOR AND TITLE
    public Livre(String auteur, String titre) {
        this.auteur = auteur;
        this.titre = titre;
        this.nombreDePage = 1;
    }

    // CONSTRUCTOR WITH AUTHOR, TITLE AND NUMBER OF PAGES
    public Livre(String auteur, String titre, int nombreDePage) {
       this.auteur = auteur;
       this.titre = titre;
       this.nombreDePage = nombreDePage;
    }

    // GET AUTHOR
    public String getAuteur() {
        return this.auteur;
    }

    // SET AUTHOR
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    // GET TITLE
    public String getTitre() {
        return  this.titre;
    }

    // SET TITLE
    public void setTitre(String titre) {
        this.titre = titre;
    }

    // GET NUMBER OF PAGES
    public int getNombreDePage() {
        return  this.nombreDePage;
    }

    // SET NUMBER OF PAGES
    public void setNombreDePage(int nombreDePage) {
        if(nombreDePage > 0) {
            this.nombreDePage = nombreDePage;
        }else {
            throw new IllegalArgumentException("Le nombre de pages doit être supérieur à 0.");
        }
    }

    // TO STRING
     @Override
    public String toString() {
        return "Titre: " + titre + ", Auteur: " + auteur + ", Nombre de pages: " + nombreDePage;
    }

   public boolean plusVolumineuxQue(Livre lv) {
        return  this.nombreDePage > lv.nombreDePage;
   }

   public static boolean plusVolumineuxQue(Livre lv1, Livre lv2) {
        return lv1.nombreDePage > lv2.nombreDePage;
   }

   // SAME AUTHOR
   public boolean aMemeAuteurQue(Livre lv){
        return this.auteur.equals(lv.auteur);
   }

   public static boolean aMemeAuteurQue(Livre lv1, Livre lv2){
        return lv1.auteur.equals(lv2.auteur);
   }




    public static void main(String[] args) {


    }
}
