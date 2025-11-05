package lachancevi;
import java.util.Scanner;

public class J1Pb4 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        System.out.print("Note : ");
        int note = Integer.parseInt(lecteur.nextLine());
        lecteur.close();
        if(note >= 60)
        {
            System.out.print("Succès");
        }
        else
        {
            System.out.print("Échec");
        }
    }
}
