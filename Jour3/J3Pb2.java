package lachancevi.Enrichissement_Jour1.Jour3;
import java.util.Scanner;

public class J3Pb2 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        double[] dListe = new double[10];
        for(int i = 0;i < dListe.length;i++)
        {
            dListe[i] = doubleTryParse("Entre un nombre", "Nombre invalide", lecteur);
        }
        System.out.println("");
        for(int i = 0;i < dListe.length;i++)
        {
            System.out.println(dListe[i]);
        }
    }
    public static double doubleTryParse(String sMessage, String sMessageErreur, Scanner lecteur)
    {
        String sValeur;
        double dValeur = 0;
        boolean bValide = false;
        do {
            System.out.println(sMessage);
            sValeur = lecteur.nextLine();
            try {
                dValeur = Double.parseDouble(sValeur);
                bValide = true;
            }
            catch(NumberFormatException e) {
                System.out.println(sMessageErreur);
                bValide = false;
            }
        } while(!bValide);
        return dValeur;
    }
}
