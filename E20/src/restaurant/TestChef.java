package restaurant;

import java.util.ArrayList;

public class TestChef {
    public static void main(String[] args) {
        ArrayList<Chef> chefs = new ArrayList<>();
        chefs.add(new Chef(1,"Adam",2.0));
        chefs.add(new Chef(2,"Bartosz",3.0));
        chefs.add(new Chef(3,"Damian",3.5));
        chefs.add(new Chef(4,"Albert",4.0));
        chefs.add(new Chef(5,"Bartlomiej",3.0));
        System.out.println(chefs);
        chefs.sort(new ChefComparator());
        System.out.println(chefs);
    }
}
