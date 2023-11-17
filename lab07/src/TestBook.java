public class TestBook {
    public static void main(String[] args) {

    }
}
class Book{
    public String title;
    public String author;
    public int numberOfPages;

    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Book tmp){
            return (this.title.equals(tmp.title) &&
                    this.author.equals(tmp.author) &&
                    this.numberOfPages == tmp.numberOfPages);
        }
        return false;
    }
}
