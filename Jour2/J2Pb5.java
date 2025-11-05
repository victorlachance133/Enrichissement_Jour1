package lachancevi.Enrichissement_Jour1.Jour2;

public class J2Pb5 {
    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for(int i = 0;i < alphabet.length();i++){
            System.out.println(alphabet.charAt(i));
        }
        System.out.println("");
        for(int i = alphabet.length();i > 0;i--){
            System.out.println(alphabet.charAt(i - 1));
        }
    }
}
