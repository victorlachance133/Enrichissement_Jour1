package lachancevi.Enrichissement_Jour1.Jour3;

import java.util.Random;

public class J3Pb5 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] iTableau = new int[10];
        for(int i = 0;i < iTableau.length;i++)
        {
            iTableau[i] = random.nextInt(100);
            System.out.println(iTableau[i]);
        }
        System.out.println("");
        int[] iTableauInverse = inverserTableau(iTableau);
        afficherTableau(iTableauInverse);
    }
    public static int[] inverserTableau(int[] iTableau)
    {
        int[] copieTableau = new int[iTableau.length];
        for(int i = 0;i < copieTableau.length; i++)
        {
            copieTableau[i] = iTableau[iTableau.length - 1 - i];
        }
        return copieTableau;
    }
    public static void afficherTableau(int[] iTableau)
    {
        for(int i = 0;i < iTableau.length; i++)
        {
            System.out.println(iTableau[i]);
        }
    }
}
