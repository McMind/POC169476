package zad01;

public class Main {
    public static void main(String[] args) {
        MusicTrack track1 = new MusicTrack("aa","bb",-1);
        System.out.println(track1.duration());
        MusicTrack track2 = new MusicTrack("bb","cc");
        System.out.println(track2.duration());
    }
}
