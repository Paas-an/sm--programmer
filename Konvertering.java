
import java.util.Scanner;

public class Konvertering {

    public static void main(final String[] args) {
        // variabler
        double tommer;
        double centimeter;
        // lage scanner
        final Scanner input = new Scanner(System.in);
        
        System.out.println("Skriv en verdi for tommer");
        tommer = input.nextDouble();
        
        //En tomme er 2.54 centimeter
        centimeter = tommer * 2.54;
        //Resultat
        System.out.println(tommer + " tommer er " + centimeter + " centimeter");
    }
}
