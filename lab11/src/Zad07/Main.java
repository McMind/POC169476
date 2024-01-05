package Zad07;
//Napisz statyczną metodę generyczną minValue,
// która przyjmuje tablicę elementów typu generycznego T,
// gdzie T rozszerza Comparable<T>.
// Metoda powinna zwracać najmniejszy element z tablicy.
// Przetestuj tę metodę na tablicach zawierających różne typy porównywalnych obiektów,
// takie jak Integer, Double, czy String.
// Zabezpiecz metodę tak, aby nie można było jej wywołać z tablicą
// o zerowej liczbie elementów. Dodaj klasę ’Personz polaminameiagei przetestuj metodęminValuena tablicy obiektówPerson`.
public class Main {
    public static void main(String[] args) {
        Integer[] tab1 = {4,3,2,6,1};
        try{
            System.out.println(minValue(tab1));
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
        }
    }
    public static<T extends Comparable<T>> T minValue(T[] obj) throws NullPointerException {
        if(obj.length == 0){
            throw new NullPointerException("Tablica jest pusta");
        }else{
            T min = obj[0];
            for(int i = 1; i < obj.length - 1; i++){
                if(obj[i].compareTo(obj[i + 1]) < 0){
                    min = obj[i];
                }
            }
            return min;
        }
    }
}
