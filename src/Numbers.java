/* Napisz program, w którym będziesz wczytywać od użytkownika liczby tak długo aż
        nie poda on liczby z przedziału [100, 200] podzielnej przez 3, czyli np. 120.
        program powinien wyświetlać odpowiednie komunikaty informujące o tym dlaczego podana liczba jest zła */

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int guessNumber = scanner.nextInt();

        while (guessNumber < 100 || guessNumber > 200 || guessNumber != 0 % 3) {
            if (guessNumber < 100) {
                System.out.println("Twoja liczba jest za mała, podaj inną liczbę");
            } else if (guessNumber > 200) {
                System.out.println("Woja liczba jest za duża, podaj inną liczbę");
            } else if (guessNumber%3 != 0) {
                System.out.println("Twoja liczba nie jest podzielna przez 3, podaj inną liczbę");
            }
            guessNumber = scanner.nextInt();
        }
        System.out.println("Bingo!");
        scanner.close();
    }
}

