public class Book {
    public String title;
    public String author;
    public int numberOfPages;
    public Book(String title,String author,int numberOfPages){
        if(numberOfPages < 0){
            this.numberOfPages = 1;
        }else{
            this.numberOfPages = numberOfPages;
        }
        if(title == null || title.isEmpty()){
            this.title = "";
        }else{
            this.title = title;
        }
        if(author == null || author.isEmpty()){
            this.author = "";
        }else{
            this.author = author;
        }
    }
    @Override
    public String toString(){
        return "Person: " + this.title +
                " by " + this.author + ", Pages: " +
                this.numberOfPages + ".";
    }
    @Override
    public boolean equals(Object obiekt){
        if(obiekt instanceof Book temp){
            return (this.numberOfPages == temp.numberOfPages &&
                    this.author.equals(temp.author) &&
                    this.title.equals(temp.title));
        }
        return false;
    }
}
