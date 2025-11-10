package lachancevi.Enrichissement_Jour1.Jour4;
import java.util.Random;
import java.util.Scanner;

public class J4Pb6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner lecteur = new Scanner(System.in);
        int nombreDeValeurs;
        do {
            System.out.println("Entre le nombre de valeurs");
            nombreDeValeurs = lecteur.nextInt();
            if(!verifierCarre(nombreDeValeurs))
            {
                System.out.println("Valeur incorrecte");
            }
        } while(!verifierCarre(nombreDeValeurs));
        lecteur.close();
        int[][] tableauAleatoire = new int[(int) Math.sqrt(nombreDeValeurs)][(int) Math.sqrt(nombreDeValeurs)];
        int[] listeValeurs = new int[nombreDeValeurs];
        for(int i = 0;i < tableauAleatoire.length;i++)
        {
            for(int j = 0;j < tableauAleatoire[0].length;j++)
            {
                tableauAleatoire[i][j] = random.nextInt(100);
                listeValeurs[i * tableauAleatoire.length + j] = tableauAleatoire[i][j];
            }
        }
        printTableau(tableauAleatoire);
        System.out.println("");
        listeValeurs = trier(listeValeurs);
        printTableau(ordreLignes(listeValeurs));
        System.out.println("");
        printTableau(ordreColonnes(listeValeurs));
    }
    public static boolean verifierCarre(int nombre)
    {
        if(Math.sqrt(nombre) % 1 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
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
    public static int[][] ordreLignes(int[] tableau)
    {
        int[][] nouveauTableau = new int[(int) Math.sqrt(tableau.length)][(int) Math.sqrt(tableau.length)];
        for(int i = 0;i < nouveauTableau.length;i++)
        {
            for(int j = 0;j < nouveauTableau[0].length; j++)
            {
                nouveauTableau[i][j] = tableau[i * nouveauTableau[0].length + j];
            }
        }
        return nouveauTableau;
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
}
