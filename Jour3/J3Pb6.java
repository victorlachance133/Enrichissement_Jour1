package lachancevi.Enrichissement_Jour1.Jour3;

import java.util.Random;

public class J3Pb6 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] iTableau = {-65, -34, 7, -3, -43, 14, 23, -9, 45, 11};
        int[] iTableauRandom = new int[10];
        afficherSommePositifEtNegatif(iTableau);
        for(int i = 0;i < iTableauRandom.length;i++)
        {
            iTableauRandom[i] = randNum(-100, 100, random);
        }
        afficherSommePositifEtNegatif(iTableauRandom);
    }
    public static void afficherSommePositifEtNegatif(int[] iTableau)
    {
        int iSommePositif = 0;
        int iSommeNegatif = 0;
        for(int i =0;i < iTableau.length;i++)
        {
            if(iTableau[i] > 0)
            {
                iSommePositif += iTableau[i];
            }
            else if(iTableau[i] < 0)
            {
                iSommeNegatif += iTableau[i];
            }
        }
        System.out.println(iSommePositif + " " + iSommeNegatif);
    }
    public static int randNum(int min, int max, Random random)
    {
        return random.nextInt(max - min + 1) + min;
    }
}
