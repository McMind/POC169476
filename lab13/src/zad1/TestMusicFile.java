package zad1;

public class TestMusicFile {
    public static void main(String[] args) {
        MusicFile musicFile1 = new MusicFile("aa", "bb");
        MusicFile musicFile2 = new MusicFile("dd", "cc", -10);
        System.out.println(musicFile1.lengthInSeconds());
        System.out.println(musicFile2.lengthInSeconds());
    }
}
