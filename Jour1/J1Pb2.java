package lachancevi.Enrichissement_Jour1.Jour1;
import java.util.Scanner;

public class J1Pb2 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        System.out.print("Salaire horraire : ");
        int salaireHorraire = Integer.parseInt(lecteur.nextLine());
        System.out.print("Heures par semaine : ");
        int heureSemaine = Integer.parseInt(lecteur.nextLine());
        lecteur.close();
        System.out.println(salaireHorraire * heureSemaine * 2);
    }
}
