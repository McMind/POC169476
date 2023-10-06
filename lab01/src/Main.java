import java.util.Scanner;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // zad1
//        System.out.println("Podaj pierwszą liczbę");
//        double liczba1 = scanner.nextDouble();
//        System.out.println("Podaj drugą liczbę");
//        double liczba2 = scanner.nextDouble();
//        System.out.printf("Wynik dodawania to : %f\n",liczba1+liczba2);
//        System.out.printf("Wynik odejmowania to : %f\n",liczba1-liczba2);
//        System.out.printf("Wynik mnożenia to : %f\n",liczba1*liczba2);
//        System.out.printf("Wynik dzielenia to : %f\n",liczba1/liczba2);
        // zad2
//        String wyraz1 = scanner.nextLine();
//        String slowo1 = scanner.next();
//        System.out.printf("%s %s\n",wyraz1,slowo1);
        // zad3
//        double liczba1 = scanner.nextDouble();
//        double liczba2 = scanner.nextDouble();
//        double liczba3 = scanner.nextDouble();
//        double liczba4 = scanner.nextDouble();
//        System.out.printf("Suma to: %f\n",liczba1+liczba2+liczba3+liczba4);
        // zad4
//        System.out.printf("Podaj bok.\n");
//        double liczba5 = scanner.nextDouble();
//        System.out.printf("Pole kwadratu to: %.2f\n",liczba5*liczba5);
        // zad6
//        System.out.printf("Wpisz numer tygodnia:\n");
//        int nr_tyg = scanner.nextInt();
//        switch(nr_tyg){
//            case 1:
//                System.out.printf("Poniedziałek");
//                break;
//            case 2:
//                System.out.printf("Wtorek");
//                break;
//            case 3:
//                System.out.printf("Środa");
//                break;
//            case 4:
//                System.out.printf("Czwartek");
//                break;
//            case 5:
//                System.out.printf("Piątek");
//                break;
//            case 6:
//                System.out.printf("Sobota");
//                break;
//            case 7:
//                System.out.printf("Niedziela");
//                break;
//            default:
//                System.out.printf("Niepoprawny dzień tygodnia");
//                break;
//        }
        //zad7
//        System.out.printf("Podaj rok\n");
//        int rok = scanner.nextInt();
//        if(rok % 400 == 0 || (rok % 4 == 0 && rok % 100 != 0)){
//            System.out.printf("rok %d jest przestępny",rok);
//        }else{
//            System.out.printf("rok %d nie jest przestępny",rok);
//        }
        //zad8
//        System.out.printf("Podaj godzinę\n");
//        int godzina = scanner.nextInt();
//        System.out.printf("Podaj minutę\n");
//        int minuta = scanner.nextInt();
//        System.out.printf("Podaj sekundę\n");
//        int sekunda = scanner.nextInt();
//        if(godzina > 23 || godzina < 0 || minuta > 60 || minuta < 0 || sekunda > 60 || sekunda < 0){
//            System.out.printf("%d:%d:%d to niepoprawny czas",godzina,minuta,sekunda);
//        }else{
//            System.out.printf("%d:%d:%d to poprawny czas",godzina,minuta,sekunda);
//        }
        //zad armstrong
//        System.out.printf("Podaj liczbę do sprawdzenia\n");
//        int liczba = scanner.nextInt();
//        int dlugosc = 0;
//        int a = liczba;
//        do{
//            a /= 10;
//            dlugosc++;
//        }
//        while(a != 0);
//        a = liczba;
//        int suma = 0;
//        do{
//            suma += (int)Math.pow(a % 10,dlugosc);
//            a /= 10;
//        }while(a != 0);
//        if(suma == liczba){
//            System.out.printf("Liczba %d jest liczbą Armstronga\n",liczba);
//        }else{
//            System.out.printf("Liczba %d nie jest liczbą Armstronga\n",liczba);
//        }
        scanner.close();
    }
}