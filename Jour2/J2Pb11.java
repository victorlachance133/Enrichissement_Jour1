package lachancevi.Enrichissement_Jour1.Jour2;
import java.util.Scanner;

public class J2Pb11 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        int iNombreEntre = lecteur.nextInt();
        System.out.println(factorielle(iNombreEntre));
        lecteur.close();
    }
    public static int factorielle(int nb)
    {
        int iRetour = nb;
        for(int i = nb - 1;i > 0;i--)
        {
            iRetour *= i;
        }
        return iRetour;
    }
}
