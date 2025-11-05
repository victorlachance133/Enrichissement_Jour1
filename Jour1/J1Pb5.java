package lachancevi.Enrichissement_Jour1.Jour1;
import java.util.Scanner;

public class J1Pb5 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        System.out.print("Prix : ");
        int prix = Integer.parseInt(lecteur.nextLine());
        lecteur.close();
        System.out.print(prix * 0.75);
    }
}
