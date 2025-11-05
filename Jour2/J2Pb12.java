package lachancevi.Enrichissement_Jour1.Jour2;
import java.util.Scanner;

public class J2Pb12 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        System.out.print("Nombre 1 : ");
        int iNb1 = lecteur.nextInt();
        System.out.print("Nombre 2 : ");
        int iNb2 = lecteur.nextInt();
        lecteur.close();
        System.out.print(sommeMinMax(iNb1, iNb2));
    }
    static public int sommeMinMax(int min,int max)
    {
        double mediane = (min + max) / 2;
        return (int) mediane * (max - min + 1);
    }
}
