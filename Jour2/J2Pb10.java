package lachancevi.Enrichissement_Jour1.Jour2;
import java.util.Scanner;

public class J2Pb10 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        System.out.println("Premier nombre");
        int iNb1 = lecteur.nextInt();
        System.out.println("Deuxième nombre");
        int iNb2 = lecteur.nextInt();
        System.out.println(plusGrand(iNb1, iNb2));
        lecteur.close();
    }
    public static int plusGrand(int i1, int i2)
    {
        return Math.max(i1,i2);
    }
}
