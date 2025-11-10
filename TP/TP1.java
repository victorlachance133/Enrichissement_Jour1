package lachancevi.Enrichissement_Jour1.TP;
import java.util.Scanner;

public class TP1 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        menu(lecteur);
    }
    public static int intTryParse(String sMessage, String sMessageErreur, Scanner lecteur)
    {
        String sValeur;
        int iValeur = 0;
        boolean bValide = false;
        do {
            System.out.println(sMessage);
            sValeur = lecteur.nextLine();
            try {
                iValeur = Integer.parseInt(sValeur);
                bValide = true;
            }
            catch(NumberFormatException e) {
                System.out.println(sMessageErreur);
                bValide = false;
            }
        } while(!bValide);
        return iValeur;
    }
    public static double doubleTryParse(String sMessage, String sMessageErreur, Scanner lecteur)
    {
        String sValeur;
        double dValeur = 0;
        boolean bValide = false;
        do {
            System.out.println(sMessage);
            sValeur = lecteur.nextLine();
            try {
                dValeur = Double.parseDouble(sValeur);
                bValide = true;
            }
            catch(NumberFormatException e) {
                System.out.println(sMessageErreur);
                bValide = false;
            }
        } while(!bValide);
        return dValeur;
    }
    public static void menu(Scanner lecteur)
    {
        int iChoix;
        boolean bContinuer = true; 
        do{
            System.out.println("Travail pratique 1 Victor Lachance \n--------------------------------------------\n\n1) Transformer $$$ en monnaie \n2) Jeu trouver un nombre mistère \n3) Quitter\n");
            iChoix = intTryParse("Choix :", "Choix invalide", lecteur);
            if(iChoix < 1 || iChoix > 3)
            {
                System.out.println("Choix invalide");
            }
            else
            {
                if(iChoix == 1)
                {
                    pieces(lecteur);
                }
                else if(iChoix == 2)
                {
                    jeuRandom(lecteur);
                }
                else
                {
                    System.exit(0);
                }
            }
        } while(bContinuer);
    }
    public static void pieces(Scanner lecteur)
    {
        double[][] pieces = {{10000, 0, 100},{5000, 0, 50},{2000, 0, 20},{1000, 0, 10},{500, 0, 5},{200, 0, 2},{100, 0, 1},{25, 0, 0.25},{10, 0, 0.10},{5, 0, 0.05},{1, 0, 0.01}};
        double dPrix = doubleTryParse("Entre un montant", "Non", lecteur) * 100;
        int iPrix = (int) dPrix;
        while(iPrix > 0)
        {
            for(int i = 0;i < pieces.length;i++)
            {
                if((int) pieces[i][0] <= iPrix)
                {
                    pieces[i][1]++;
                    iPrix -= pieces[i][0];
                    i = pieces.length;
                }
            }
        }
        for(int i = 0;i < pieces.length;i++)
        {
            if(pieces[i][1] > 0)
            {
                System.out.print(pieces[i][2] + " $ x " + (int) pieces[i][1] + "; ");
            }
        }
        System.out.println("");
    }
    public static void jeuRandom(Scanner lecteur)
    {
        int iRand = (int) (Math.random()*20);
        int iGuess;
        int nbGuess = 0;
        boolean bTrouve = false;
        do
        {
            iGuess = intTryParse("Essaye de deviner le nombre mystère", "Nombre invalide", lecteur);
            if(iGuess > iRand)
            {
                System.out.println("Plus petit");
            }
            else if(iGuess < iRand)
            {
                System.out.println("Plus grand");
            }
            else
            {
                System.out.println("Trouvé !");
                bTrouve = true;
            }
            nbGuess++;
        } while(nbGuess < 7 && !bTrouve);
        if(!bTrouve)
        {
            System.out.println("Perdu");
        }
    }
}
