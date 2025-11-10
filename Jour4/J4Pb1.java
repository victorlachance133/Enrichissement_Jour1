package lachancevi.Enrichissement_Jour1.Jour4;

public class J4Pb1 {
    public static void main(String[] args) {
        int[] nombres = {12,50,10,20,30};
        nombres = trier(nombres);
        for(int i = 0;i<10;i++)
        {
            System.out.println(nombres[i]);
        }
    }
    public static int[] trier(int[] tableau)
    {
        int[] copie = tableau;
        int plusPetit = 0;
        int posPlusPetit = 0;
        for(int i = 0;i < copie.length - 1;i++)
        {
            for(int j = 0;j < copie.length - i;j++)
            {
                if(j == 0)
                {
                    plusPetit = copie[j+i];
                    posPlusPetit = j + i;
                }
                else if(copie[j+i] < plusPetit)
                {
                    plusPetit = copie[j + i];
                    posPlusPetit = j + i;
                }
            }
            copie[posPlusPetit] = copie[i];
            copie[i] = plusPetit;
        }
        return copie;
    }
}
