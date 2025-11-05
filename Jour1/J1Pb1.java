import java.util.Scanner;

public class J1Pb1 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        System.out.println("Entrez le 1er nombre");
        int nb1 = Integer.parseInt(lecteur.nextLine());
        System.out.println("Entrez le 2e nombre");
        int nb2 = Integer.parseInt(lecteur.nextLine());
        lecteur.close();
        if(nb1 > nb2)
        {
            System.out.print("Nb1 est plus grand " + nb1);
        }
        else if(nb2 > nb1)
        {
            System.out.print("Nb2 est plus grand " + nb2);
        }
    }
}
