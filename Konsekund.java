import java.util.Scanner;


public class Konsekund{
    public static void main(final String[] args) {
        double timer;
        double minutter;
        double sekunder;
        final double total;

        final Scanner input = new Scanner(System.in);

        System.out.println("Skriv antall sekunder");
        sekunder = input.nextDouble();
        input.close();
        
        timer = sekunder / 3600;                //deler for å få timer  
        minutter = (sekunder % 3600) / 60;      // delere resterende for minutter   
        sekunder = (sekunder % 3600) % 60;      

       
        System.out.println( "Dette gir  " +  timer  + "  Timer " +  minutter  + " Minutter " +  sekunder + "  Sekunder");


    }
}