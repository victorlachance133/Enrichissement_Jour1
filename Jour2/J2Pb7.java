package lachancevi.Enrichissement_Jour1.Jour2;
import java.util.Scanner;

public class J2Pb7 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        String voyelles = "aeiouy";
        String consonnes = "bcdfghjklmnpqrstvwxz";
        System.out.println("Entre une phrase : ");
        String phraseEntree = lecteur.nextLine();
        lecteur.close();
        System.out.println("Nombre de voyelles : " + compterOccurences(phraseEntree, voyelles) + "\nNombre de consonnes : " + compterOccurences(phraseEntree, consonnes));
    }
    public static int compterOccurences(String s1, String s2)
    {
        int nbOccurences = 0;
        for(int i1 = 0;i1 < s1.length();i1++)
        {
            for(int i2 = 0;i2 < s2.length();i2++)
            {
                if(s1.charAt(i1) == s2.charAt(i2))
                {
                    nbOccurences++;
                }
            }
        }
        return nbOccurences;
    }
}