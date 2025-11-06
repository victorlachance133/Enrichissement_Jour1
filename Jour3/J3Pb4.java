package lachancevi.Enrichissement_Jour1.Jour3;
import java.util.Random;

public class J3Pb4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] iNombres = new int[5];
        int iPlusPetit = 100;
        int iPlusGrand = 0;
        int iPositionPetit = 0;
        int iPositionGrand = 0;
        for(int i = 0;i < iNombres.length; i++)
        {
            iNombres[i] = randNum(0, 100, random);
        }
        for(int i = 0;i < iNombres.length;i++)
        {
            if(iNombres[i] > iPlusGrand)
            {
                iPlusGrand = iNombres[i];
                iPositionGrand = i;
            }
            if(iNombres[i] < iPlusPetit)
            {
                iPlusPetit = iNombres[i];
                iPositionPetit = i;
            }
        }
        System.out.println("Nombre plus petit : " + iPlusPetit + " Position : " + iPositionPetit);
        System.out.println("Nombre plus grand : " + iPlusGrand + " Position : " + iPositionGrand);
        for(int i = 0;i < iNombres.length; i++)
        {
            System.out.println(iNombres[i]);
        }
    }
    public static int randNum(int min, int max, Random random)
    {
        return random.nextInt(max - min + 1) + min;
    }
}
