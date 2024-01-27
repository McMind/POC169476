package arrayAlg;

public class VideoGame implements Comparable<VideoGame>{
    private String name;
    private String developer;
    private float rating;

    public VideoGame(String name, String developer, float rating) {
        this.name = name;
        this.developer = developer;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getDeveloper() {
        return developer;
    }

    public float getRating() {
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDeveloper(String developer) {
        this.developer = developer;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VideoGame videoGame = (VideoGame) o;

        if (Float.compare(getRating(), videoGame.getRating()) != 0) return false;
        if (getName() != null ? !getName().equals(videoGame.getName()) : videoGame.getName() != null) return false;
        return getDeveloper() != null ? getDeveloper().equals(videoGame.getDeveloper()) : videoGame.getDeveloper() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + (getDeveloper() != null ? getDeveloper().hashCode() : 0);
        result = 31 * result + (getRating() != 0.0f ? Float.floatToIntBits(getRating()) : 0);
        return result;
    }

    @Override
    public String toString() {
        return "VideoGame{" +
                "name='" + name + '\'' +
                ", developer='" + developer + '\'' +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(VideoGame o) {
        return Float.compare(o.rating,this.rating);
    }
}
