package kolos1;

import java.util.ArrayList;
import java.util.Objects;

public class TestTeam {
    public static void main(String[] args) {
        SoccerTeam druzynaPilki = new SoccerTeam();
        VolleyballTeam druzynaSiatki = new VolleyballTeam();
        druzynaSiatki.setName("100 mil");
        druzynaSiatki.setCity("Olsztyn");
        ArrayList<Integer> punkty = new ArrayList<>();
        punkty.add(5);
        punkty.add(10);
        druzynaSiatki.setPoints(punkty);
        druzynaSiatki.setNumberOfVictories(7);
        System.out.println(druzynaSiatki);

    }
}
class Team{
     protected String name;
     protected String city;
     protected ArrayList<Integer> points;

    public Team(){
        points = new ArrayList<Integer>();
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public ArrayList<Integer> getPoints() {
        return points;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPoints(ArrayList<Integer> points) {
        this.points = points;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team team = (Team) o;
        return Objects.equals(name, team.name) && Objects.equals(city, team.city) && Objects.equals(points, team.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, points);
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", points=" + points +
                '}';
    }
}
class SoccerTeam extends Team{
    private int rankingPosition;

    public SoccerTeam() {
        super();
    }

    public int getRankingPosition() {
        return rankingPosition;
    }

    public void setRankingPosition(int rankingPosition) {
        this.rankingPosition = rankingPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SoccerTeam that = (SoccerTeam) o;
        return Objects.equals(name, that.name) && Objects.equals(city, that.city) && Objects.equals(points, that.points) && getRankingPosition() == that.getRankingPosition();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRankingPosition());
    }

    @Override
    public String toString() {
        return "SoccerTeam{" +
                "rankingPosition=" + rankingPosition +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", points=" + points +
                '}';
    }
}

class VolleyballTeam extends Team{
    private int numberOfVictories;

    public VolleyballTeam() {
        super();
    }

    public int getNumberOfVictories() {
        return numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        VolleyballTeam that = (VolleyballTeam) o;
        return Objects.equals(name, that.name) && Objects.equals(city, that.city) && Objects.equals(points, that.points) &&numberOfVictories == that.numberOfVictories;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfVictories);
    }

    @Override
    public String toString() {
        return "VolleyballTeam{" +
                "numberOfVictories=" + numberOfVictories +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", points=" + points +
                '}';
    }
}