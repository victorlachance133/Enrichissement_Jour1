package lachancevi.Enrichissement_Jour1.Jour2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class J2Pb8 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        List<String> motsEntres = new ArrayList<>();
        String sMotEntre = "";
        do {
            System.out.println("Entre : ");
            sMotEntre = lecteur.nextLine();
            motsEntres.add(sMotEntre);
        } while(sMotEntre.equals("stop") == false);
        lecteur.close();
        Collections.sort(motsEntres);
        System.out.println("Premier : " + motsEntres.get(0));
        System.out.println("Dernier : " + motsEntres.get(motsEntres.size()-1));
    }
}
