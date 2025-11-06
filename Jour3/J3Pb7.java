package lachancevi.Enrichissement_Jour1.Jour3;

import java.util.Random;

public class J3Pb7 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] iTableau = new int[10];
        for(int i = 0;i < iTableau.length;i++)
        {
            iTableau[i] = random.nextInt(5);
        }
        int[][] iOccurences = {{0,0},{1,0},{2,0},{3,0},{4,0}};
        for(int i=0;i<5;i++)
        {
            iOccurences[i][1] = nbOccurences(i, iTableau);
            System.out.println(i + " : " + iOccurences[i][1]);
        }
    }
    public static int nbOccurences(int recherche, int[] tableau)
    {
        int ctr = 0;
        for(int i=0;i<tableau.length;i++)
        {
            if(tableau[i] == recherche)
            {
                ctr++;
            }
        }
        return ctr;
    }
}
