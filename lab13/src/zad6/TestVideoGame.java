package zad6;

public class TestVideoGame {
    public static void main(String[] args) {
        try {
            VideoGame mario = new VideoGame("Mario", "2d platformer", 1985);
            VideoGame mario2 = (VideoGame) mario.clone();
            mario2.setReleaseYear(1995);
            System.out.println(mario.getReleaseYear());
            System.out.println(mario2.getReleaseYear());
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
    }
}
