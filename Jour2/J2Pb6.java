package lachancevi.Enrichissement_Jour1.Jour2;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class J2Pb6 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        int iNombreEntre = 1;
        String sNombreEntre = "";
        int iTotal = 0;
        List<Integer> nombres = new ArrayList<>();
        do {
            System.out.println("Entre un nombre");
            sNombreEntre = lecteur.nextLine();
            try{
                iNombreEntre = Integer.parseInt(sNombreEntre);
                nombres.add(iNombreEntre);
            }
            catch(NumberFormatException e){
                System.out.println("Mauvaise réponse");
            }
        } while(iNombreEntre != 0);
        lecteur.close();
        System.out.println("Min : " + Collections.max(nombres));
        System.out.println("Max : " + Collections.min(nombres));
        for (Integer nombre : nombres) {
            iTotal += nombre;
        }
        System.out.println("Avg : " + iTotal / nombres.size());
    }
}