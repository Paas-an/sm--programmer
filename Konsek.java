import java.util.Scanner;

public class Konsek{

    public static void main(String[] args) {
        
        double timer;       // setter variabler
        double minutter;
        double sekunder;
        double total;

         Scanner input = new Scanner(System.in);

        System.out.println("Skriv antall timer");
        timer = input.nextDouble();

        System.out.println("Skriv antall minutter");
        minutter = input.nextDouble();

        System.out.println("Skriv antall sekunder");
        sekunder = input.nextDouble();

        timer = timer * 3600;      // omgjør timer - sek
        minutter = minutter * 60;   // omgjør omgjør min - sek
        sekunder = sekunder;        // her trengs ikke gjøre noe
        total = timer + minutter + sekunder;      // Variabel som setter sammen alle svar

        System.out.println("Det er " + total + " sekunder");


    } 
}