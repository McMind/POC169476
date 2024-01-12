package zad01;

public record MusicTrack(String title, String artist, int duration) {
    public MusicTrack(String title, String artist) {
        this(title, artist, 180);
    }


    public MusicTrack {
       duration = Math.max(duration, 0);
    }
}
