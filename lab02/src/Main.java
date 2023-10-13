import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
//        System.out.printf("%f\n",generateRandomDouble());
//        int[] tab = {3,5,4,2};
//        System.out.printf("%d\n",Arrays.stream(tab).min().getAsInt());
//        ArrayList<Integer> lista1 = new ArrayList<>();
//        lista1.add(4);
//        piramida();
//        System.out.printf("%f\n",generateRandomGaussian());
//        odwrocTab();
//        System.out.printf("%f\n",srdWartosc());
//        minMax();
        ArrayList<Integer> lista11 = new ArrayList<>();
        lista11.add(3);
        lista11.add(0);
        lista11.add(1);
        lista11.add(0);
        System.out.printf("%d\n",countZeroes(lista11));
    }
     public static int generateRandomInt() {
        int liczba = random.nextInt();
        return liczba;
    }
    public static double genereateRandomDouble(){
        double liczba = random.nextDouble();
        return liczba;
    }

    public static void piramida() {
        System.out.printf("Podaj znak\n");
        String znak = scanner.next();
        System.out.printf("Podaj wysokość\n");
        int wysokosc = scanner.nextInt();

        for (int i = 0; i < wysokosc; i++) {
            int liczbaSpacji = wysokosc - 1 - i;
            int liczbaZnakow = 2 * i + 1;

            StringBuilder sb = new StringBuilder();
            while (liczbaSpacji-- > 0) {
                sb.append(' ');
            }
            while (liczbaZnakow-- > 0) {
                sb.append(znak);
            }
            String doWypisania = sb.toString();
            System.out.printf("%s\n", doWypisania);
        }
    }
    public static double generateRandomGaussian(){
        double wynik = random.nextGaussian();
        return wynik;
    }

    public static boolean generateRandomBoolean(){
        boolean wynik = random.nextBoolean();
        return wynik;
    }

    public static void odwrocTab(){
        int[] tab = {1,2,3,4,5,6,7,8,9,10};
        for(int i = tab.length - 1; i >= 0; i--){
            System.out.printf("%d\n",tab[i]);
        }
    }

    public static double srdWartosc(){
        ArrayList<Integer> lista = new ArrayList<>();
        int i = 0;
        while(i++ < 20){
            lista.add(random.nextInt(1,100));
        }
        int suma = 0;
        i = 0;
        while(i++ < 19){
            suma += lista.get(i);
        }
        return (double)suma/20;
    }

    public static void minMax(){
        ArrayList<Integer> lista = new ArrayList<>();
        int i = 0;
        while(i++ < 15){
            lista.add(random.nextInt(1,100));
        }
        System.out.printf("Max: %d\n",Collections.max(lista));
        System.out.printf("Min: %d\n",Collections.min(lista));
    }

    public static int countZeroes(ArrayList<Integer> lista){
        int ilosc0 = 0;
        for(int i = 0; i < lista.size(); i++){
            if(lista.get(i) == 0){
                ilosc0++;
            }
        }
        return ilosc0;
    }
}