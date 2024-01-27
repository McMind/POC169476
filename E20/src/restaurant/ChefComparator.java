package restaurant;

import java.util.Comparator;

public class ChefComparator implements Comparator<Chef> {
    @Override
    public int compare(Chef o1, Chef o2) {
        int result = Double.compare(o2.getSkillLevel(),o1.getSkillLevel());
        return result == 0 ? o1.getName().compareToIgnoreCase(o2.getName()) : result;
    }
}
