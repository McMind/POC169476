package sports;

import java.util.Arrays;

public class FootballPlayer implements Cloneable {
    private String name;
    private int[] goals;

    public FootballPlayer(String name, int[] goals) {
        this.name = name;
        if(goals.length == 5)
            this.goals = goals;
        else
            this.goals = new int[5];
    }

    public String getName() {
        return name;
    }

    public int[] getGoals() {
        return goals;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGoals(int[] goals) {
        if(goals.length == 5)
            this.goals = goals;
        else
            this.goals = new int[5];
    }

    public void setGoal(int goal, int n){
        if(n < 5 && n >= 0){
            this.goals[n] = goal;
        }
    }

    @Override
    public FootballPlayer clone() {
        try {
            FootballPlayer clone = (FootballPlayer) super.clone();
            int[] goals = new int[5];
            for(int i = 0; i < this.getGoals().length; i++){
                goals[i] = this.getGoals()[i];
            }
            clone.setGoals(goals);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }


    @Override
    public String toString() {
        return "Imię: " + name  +
                ", gole: " + Arrays.toString(goals);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FootballPlayer player = (FootballPlayer) o;

        if (getName() != null ? !getName().equals(player.getName()) : player.getName() != null) return false;
        return Arrays.equals(getGoals(), player.getGoals());
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + Arrays.hashCode(getGoals());
        return result;
    }
}
