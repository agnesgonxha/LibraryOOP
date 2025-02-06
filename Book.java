public class Book {
    private String title;
    private String code;
    private Author author;

    public Book (String title, String code, Author author){
        this.title = title;
        this.code = code;
        this.author = author;
    }

    public void setTitle (String title) {this.title = title;}
    public void setCode (String code) {this.code = code;}
    public void setAuthor (Author author) {this.author = author;}

    public String getTitle () {return title;}
    public String getCode () {return code;}
    public Author getAuthor () {return author;}
}
