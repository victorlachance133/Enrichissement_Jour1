package lachancevi.Enrichissement_Jour1.Jour4;

public class J4Pb4 {
    public static void main(String[] args) {
        int[] tableau = {1,2,3,4,5,6,7,8,9};
        tableau = ajouterDansTableau(tableau, 10);
        for(int i = 0;i < tableau.length; i++)
        {
            System.out.println(tableau[i]);
        }
    }
    public static int[] ajouterDansTableau(int[] tableau,int valeur)
    {
        int[] copie = new int[tableau.length + 1];
        for(int i = 0;i < tableau.length;i++)
        {
            copie[i] = tableau[i];
        }
        copie[copie.length-1] = valeur;
        return copie;
    }
}
