package lachancevi.Enrichissement_Jour1.Jour2;
import java.util.Scanner;

public class J2Pb3 {
    public static void main(String[] args) {
        int iNbLettreA = 0;
        Scanner lecteur = new Scanner(System.in);
        System.out.println("Entre une phrase");
        String phrase = lecteur.nextLine();
        lecteur.close();
        System.out.println(phrase.toUpperCase());
        for(int i=0;i<phrase.length();i++)
        {
            if(phrase.toUpperCase().charAt(i) == 'A')
            {
                iNbLettreA++;
            }
        }
        System.out.println("Nombre de A : " + iNbLettreA);
        System.out.println(phrase.toUpperCase().replace("A", "$"));
    }
}
