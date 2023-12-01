package kolos1;

import java.util.ArrayList;

public class Tablica {
    public static void main(String[] args) {
        int[] tab = {1,2,3,44,312321};
        ArrayList<Integer> tab2 = new ArrayList<>();
        tab2.add(3);
        tab2.add(5);
        for (int i : tab) {
            System.out.println(i);
        }
        System.out.println(tab2);
        StringBuilder tekst = new StringBuilder("słowo pańskie");
        for(int i = 0; i < tekst.length(); i++){
            if(tekst.charAt(i) == 'o'){
                tekst.deleteCharAt(i);
            }
        }
        System.out.println(tekst);
    }
}
