package sports;

import java.util.Arrays;

public class TestFootballPlayer {
    public static void main(String[] args) {
        FootballPlayer player = new FootballPlayer("Robert",new int[]{3,4,1,5,2});
        FootballPlayer player2 = player.clone();
        player2.setGoal(1,4);
        System.out.println(Arrays.toString((player.getGoals())));
        System.out.println(Arrays.toString((player2.getGoals())));
    }
}
