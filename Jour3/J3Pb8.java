package lachancevi.Enrichissement_Jour1.Jour3;
import java.util.Scanner;

public class J3Pb8 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        Object[][] etudiantsNotes = {{"Pierre",65,45,34},{"André",78,55,65},{"Julie",43,67,21},{"Brigitte",82,89,67},{"Anne",76,100,75},{"Olivier",91,95,54},{"Simon",71,92,69},{"Nadine",96,81,54}};

        //Passer les lignes suivantes en code afin de permettre de rentrer les données
        /*for(int i = 0;i < etudiantsNotes.length;i++)
        {
            System.out.println("Entrez un nom");
            etudiantsNotes[i][0] = lecteur.nextLine();
            for(int i2 = 1;i2 < etudiantsNotes[i].length;i2++)
            {
                etudiantsNotes[i][i2] = intTryParse("Entrez la note numéro : " + i2, "Note invalide", lecteur);
            }
        }*/
        lecteur.close();

        //Afficher le tableau en entier
        for(int i = 0;i < etudiantsNotes.length;i++)
        {
            for(int i2 = 0;i2 < etudiantsNotes[i].length;i2++)
            {
                System.out.print(etudiantsNotes[i][i2] + " ");
            }
            System.out.println();
        }
        System.out.println("");


        //Afficher les moyennes pour chaque examen
        for(int i = 1;i < etudiantsNotes[0].length;i++)
        {
            System.out.println(moyEval(etudiantsNotes, i));
        }
        System.out.println("");


        //Afficher les moyennes pour chaque élève
        for(int i = 0;i < etudiantsNotes.length;i++)
        {
            System.out.println(moyEleve(etudiantsNotes, i));
        }
    }
    public static int moyEval(Object[][] notes, int numExamen)
    {
        int total = 0;
        for(int i = 0;i < notes.length;i++)
        {
            total += (int) notes[i][numExamen];
        }
        return total / notes.length;
    }
    public static int moyEleve(Object[][] notes, int numEleve)
    {
        int total = 0;
        for(int i = 1;i < notes[numEleve].length;i++)
        {
            total += (int) notes[numEleve][i];
        }
        return total / (notes[numEleve].length - 1);
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
}
