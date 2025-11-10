package lachancevi.Enrichissement_Jour1.Jour4;

public class J4Pb3 {
    public static void main(String[] args) {
        int[] tableau = {1,2,3,4,5,6,7,8,9};
        printTableau(ordreColonnes(tableau));
    }
    public static int[][] ordreColonnes(int[] tableau)
    {
        int[][] nouveauTableau = new int[(int) Math.sqrt(tableau.length)][(int) Math.sqrt(tableau.length)];
        for(int i = 0;i < nouveauTableau.length;i++)
        {
            for(int j = 0;j < nouveauTableau[0].length; j++)
            {
                nouveauTableau[j][i] = tableau[i * nouveauTableau[0].length + j];
            }
        }
        return nouveauTableau;
    }
    public static void printTableau(int[][] tableau)
    {
        for(int i = 0;i < tableau.length;i++)
        {
            for(int j = 0;j < tableau[0].length; j++)
            {
                System.out.print(tableau[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
