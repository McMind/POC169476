package Zad02;

import java.util.InputMismatchException;
import java.util.Scanner;

//Napisz program, który prosi użytkownika o wpisanie dwóch liczb,
// a następnie dzieli pierwszą liczbę przez drugą. Program powinien obsługiwać dwa rodzaje wyjątków:
// ArithmeticException w przypadku dzielenia przez zero i InputMismatchException, gdy użytkownik wprowadzi coś innego niż liczby.
// W obu przypadkach należy wyświetlić stosowny komunikat błędu i poprosić użytkownika o ponowne wprowadzenie danych. Wykorzystaj typ int.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Podaj pierwszą liczbę do dzielenia: ");
                int a = scanner.nextInt();
                System.out.print("Podaj drugą liczbę do dzielenia: ");
                int b = scanner.nextInt();
                System.out.println(a / b);
                break;
            } catch (ArithmeticException e) {
                System.out.println("Dzielenie przez zero");
            } catch (InputMismatchException e) {
                System.out.println("Nie podano liczby");
                scanner.next();
            }
        }
    }
}
