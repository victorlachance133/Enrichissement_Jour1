package lachancevi;
import java.util.Scanner;

public class J1Pb3 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        System.out.print("Age premier dude : ");
        int age1 = Integer.parseInt(lecteur.nextLine());
        System.out.print("Age deuxième dude : ");
        int age2 = Integer.parseInt(lecteur.nextLine());
        lecteur.close();
        System.out.println("Moyenne : " + (age1 + age2) / 2);
        System.out.println("Plus grand : " + Math.max(age1,age2));
    }
}
