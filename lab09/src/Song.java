import java.util.ArrayList;
import java.util.Comparator;

public class Song {
    public String title;
    public String artist;
    public int duration;

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                '}';
    }

    public Song(String title, String artist, int duration) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
    }

    public static void main(String[] args) {
        ArrayList<Song> songs = new ArrayList<>();
        songs.add(new Song("zzz","bbb",330));
        songs.add(new Song("aaa","ccc",320));
        songs.add(new Song("bbb","bbb",350));
        songs.add(new Song("aaa","bbb",380));
        songs.add(new Song("ccc","bbb",440));
        System.out.println(songs);
        songs.sort(new DurationComparator());
        System.out.println(songs);
        songs.sort(new ArtistTitleComparator());
        System.out.println(songs);
    }
}
class DurationComparator implements Comparator<Song>{

    @Override
    public int compare(Song o1, Song o2) {
        return o1.duration - o2.duration;
    }
}
class ArtistTitleComparator implements Comparator<Song>{

    @Override
    public int compare(Song o1, Song o2) {
        int compare = o1.artist.compareToIgnoreCase(o2.artist);
        if(compare == 0){
            return o1.title.compareToIgnoreCase(o2.title);
        }
        return compare;
    }
}