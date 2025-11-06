package lachancevi.Enrichissement_Jour1.Jour3;
import java.util.Random;

public class J3Pb3 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] iTableau1 = new int[10];
        int[] iTableau2 = new int[10];
        for(int i = 0;i < iTableau1.length;i++)
        {
            iTableau1[i] = random.nextInt(100);
        }
        for(int i = 0;i < iTableau1.length; i++)
        {
            iTableau2[i] = iTableau1[iTableau1.length - 1 - i];
        }
        for(int i = 0;i < iTableau1.length;i++)
        {
            System.out.println(iTableau1[i]);
        }
        System.out.println("");
        for(int i = 0;i < iTableau2.length;i++)
        {
            System.out.println(iTableau2[i]);
        }
    }
}
