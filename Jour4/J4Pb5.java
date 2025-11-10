package lachancevi.Enrichissement_Jour1.Jour4;

public class J4Pb5 {
    public static void main(String[] args) {
        int[] tableau = {1,2,3,0,4,5,6,0,7,8,9};
        tableau = retirerDansTableau(tableau, 3);
        tableau = retirerDansTableau(tableau, 6);
        for(int i = 0;i < tableau.length;i++)
        {
            System.out.println(tableau[i]);
        }
    }
    public static int[] retirerDansTableau(int[] tableau,int index)
    {
        int sauter = 0;
        int[] copie = new int[tableau.length - 1];
        for(int i = 0;i < copie.length;i++)
        {
            if(i == index)
            {
                sauter = 1;
            }
            copie[i] = tableau[i+sauter];
        }
        return copie;
    }
}
