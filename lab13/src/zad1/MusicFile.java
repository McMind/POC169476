package zad1;

public record MusicFile(String title, String artist, int lengthInSeconds) {
    public MusicFile(String title, String artist, int lengthInSeconds) {
        this.title = title;
        this.artist = artist;
        this.lengthInSeconds = lengthInSeconds < 0 ? 60 : lengthInSeconds;
    }

    public MusicFile(String title, String artist) {
        this(title, artist, 90);
    }
}
