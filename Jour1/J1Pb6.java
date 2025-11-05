package lachancevi.Enrichissement_Jour1.Jour1;
import java.util.Scanner;

public class J1Pb6 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        System.out.println("Bonjour quel est ton nom");
        String nom = lecteur.nextLine();
        System.out.println("Quelle type de plancher ? 1- Chêne 2- Érable 3-Pin");
        int choixPlancher = lecteur.nextInt();
        switch (choixPlancher) {
            case 1:
                choixPlancher = 5;
                break;
            case 2:
                choixPlancher = 12;
                break;
            case 3:
                choixPlancher = 10;
                break;
            default:
                System.out.println("Mauvaise réponse");
                System.exit(0);
                break;
        }
        System.out.println("Quelle longueur ? (m)");
        int longueur = lecteur.nextInt();
        System.out.println("Quelle largeur ? (m)");
        int largeur = lecteur.nextInt();
        lecteur.close();
        int surface = longueur * largeur;
        System.out.println(nom + " " + surface + " m2, " + surface * choixPlancher + "$");
    }
}