package arrayAlg;

public class MaxIndex {
    public static <T extends Comparable<T>> int findMaxIndex(T[] tab) throws IllegalArgumentException {
        if(tab == null || tab.length == 0){
            throw new IllegalArgumentException("Tablica jest pusta lub jest nullem");
        }
        int max = 0;
        for(int i = 1; i < tab.length; i++){
            if(tab[max].compareTo(tab[i]) > 0){
                max = i;
            }
        }
        return max;
    }
}
