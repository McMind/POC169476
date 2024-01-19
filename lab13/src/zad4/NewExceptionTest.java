package zad4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NewExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            double arg = scanner.nextDouble();
            System.out.println(getTwoDigitPower(arg));
        } catch (ValueTooHighException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Nie podano liczby");
        }
    }

    public static double getTwoDigitPower(double arg) throws ValueTooHighException {
        if (arg < 100 && arg > -100) {
            return Math.pow(arg, 2);
        }
        throw new ValueTooHighException("Liczba spoza przedziału (-100;100)");
    }
}
