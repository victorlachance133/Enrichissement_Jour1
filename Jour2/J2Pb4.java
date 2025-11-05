package lachancevi.Enrichissement_Jour1.Jour2;
import java.util.Scanner;

public class J2Pb4 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        int iValeurEntree;
        do {
            iValeurEntree = lecteur.nextInt();
        } while(iValeurEntree < 0 || iValeurEntree > 100);
        lecteur.close();
    }
}
