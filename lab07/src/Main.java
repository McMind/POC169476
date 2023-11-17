import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Napisz statyczną metodę mergeArrays,
        // która przyjmuje dwie tablice liczb całkowitych jako argumenty.
        // Funkcja powinna zwrócić nową listę tablicową,
        // która jest połączeniem obu pierwotnych tablic.
        // Na przykład, dla list tablicowych [1, 2, 3] i [4, 5, 6],
        // funkcja powinna zwrócić [1, 2, 3, 4, 5, 6]. Stwórz przypadek testowy.
        int[] tab1 = {1,2,3};
        int[] tab2 = {4,5,6};
        ArrayList<Integer> wynik = mergeArrays(tab1,tab2);
        System.out.println(wynik);
    }

    public static ArrayList<Integer> mergeArrays(int[] tab1, int[] tab2){
        ArrayList<Integer> wynik = new ArrayList<>();
        for (int j : tab1) {
            wynik.add(j);
        }
        for (int j : tab2) {
            wynik.add(j);
        }
        return wynik;
    }
}