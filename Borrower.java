import java.util.ArrayList;

public class Borrower {
    private String name;
    private ArrayList<Book> borrowBooks = new ArrayList<>();

    public Borrower (String name){
        this.name = name;
    }

    public void setName (String name) {this.name = name;}

    public String getName () {return name;}

    public void addBook (Book book){
        borrowBooks.add(book);
        System.out.println(name + " borrowed: " + book.getTitle());
    }

    public void displayBorrowedBooks (){
        System.out.println(name + "'s Borrowed Books:");
        for (int i = 0; i < borrowBooks.size(); i++){
            System.out.println("Title: " + borrowBooks.get(i).getTitle());
            System.out.println("ISBN: " + borrowBooks.get(i).getCode());
            System.out.println("Author: " + borrowBooks.get(i).getAuthor().getName());
            System.out.println("Biography: " + borrowBooks.get(i).getAuthor().getDesc());
            System.out.println("---------------------------------------------------");
        }
    }

    public void removeBook (Book book){
        borrowBooks.remove(book);
        System.out.println(name + " returned: " + book.getTitle());
    }
}
