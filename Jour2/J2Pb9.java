package lachancevi.Enrichissement_Jour1.Jour2;
import java.util.Scanner;

public class J2Pb9 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        int iRayon = 0;
        String sRayon = "";
        do {
            System.out.println("Rayon du cercle");
            sRayon = lecteur.nextLine();
            try {
                iRayon = Integer.parseInt(sRayon);
            }
            catch(NumberFormatException e)
            {
                System.out.println("Valeur invalide");
            }
            
        } while(iRayon <= 0);
        lecteur.close();
        System.out.println(circonference(iRayon));
    }
    public static double circonference(int rayon)
    {
        return rayon * 2 * Math.PI;
    }
}