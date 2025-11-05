package lachancevi.Enrichissement_Jour1.Jour2;
import java.util.Scanner;

public class J2Pb13 {
    public static void main(String[] args) {
        Scanner lecteur = new Scanner(System.in);
        String sConvertion;
        int iTemperature = 0;
        String sTemperature;
        Boolean tempIsSet = false;
        do {
            System.out.println("C - convertir de celcius à fahraneit \nF - convertir de fahraneit à celcius");
            sConvertion = lecteur.nextLine();
        } while(sConvertion.toUpperCase().charAt(0) != 'C' && sConvertion.toUpperCase().charAt(0) != 'F');
        do {
            System.out.println("Entrer température : ");
            sTemperature = lecteur.nextLine();
            try{
                iTemperature = Integer.parseInt(sTemperature);
                tempIsSet = true;
            }
            catch(NumberFormatException e)
            {
                System.out.println("Réponse invalide");
                tempIsSet = false;
            }
        } while(tempIsSet == false);
        lecteur.close();
        if(sConvertion.toUpperCase().charAt(0) == 'C')
        {
            System.out.println(iTemperature * 9 / 5 + 32 + " °F");
        }
        else 
        {
            System.out.println((iTemperature - 32) * 5 / 9 + " °C");
        }
    }
}
