import java.util.Scanner;


public class NumberGame {

    public static void main(String[] args){

        boolean wygrana = false;
        int randomNumber = (int) (Math.random() *100) + 1;
        System.out.println("Wylosuję liczbę od 1 do 100");
        System.out.println("Spróbuj ją odgadnąć. Masz 10 prób");
     //   System.out.println(randomNumber);

        Scanner scaner = new Scanner(System.in);

        for (int i = 1; i < 11 ; i++) {
            System.out.println("To Twoja " + i + " próba. Wpisz liczbę: ");
            int wpisanaLiczba = scaner.nextInt();

            if (wpisanaLiczba > randomNumber) {
                System.out.println("Wpisałeś za dużą liczbę");
            }

            else if (wpisanaLiczba < randomNumber) {
                System.out.println("Wpisałeś za małą liczbę");

            }

            else {
                wygrana = true;
                break;
            }
        }

        if (wygrana) {
            System.out.println("Brawo wygrałeś !!!");
        } else
            System.out.println("Przegrałeś !!! To była liczba: " + randomNumber  );

    }
}
