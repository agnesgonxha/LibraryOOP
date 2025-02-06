import java.util.ArrayList;

public class Library {
    private ArrayList<Book> bookList = new ArrayList<>();

    public Library (){

    }

    public void addBook (Book book){
        bookList.add(book);
        System.out.println("Book added to library: " + book.getTitle());
    }

    public void borrowBook (Borrower borrower, Book book){
        bookList.remove(book);
        borrower.addBook(book);
    }

    public void returnBook (Borrower borrower, Book book){
        bookList.add(book);
        borrower.removeBook(book);
    }

    public void displayLibraryBooks (){
        System.out.println("Books in Library:");
        for (int i = 0; i < bookList.size(); i++){
            System.out.println("Title: " + bookList.get(i).getTitle());
            System.out.println("ISBN: " + bookList.get(i).getCode());
            System.out.println("Author: " + bookList.get(i).getAuthor().getName());
            System.out.println("Biography: " + bookList.get(i).getAuthor().getDesc());
            System.out.println("---------------------------------------------------");
        }
    }
}
