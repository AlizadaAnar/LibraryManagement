package libraryManagement.libraryImpl;

import libraryManagement.allEnums.Genre;
import libraryManagement.entity.Book;
import libraryManagement.exceptionHandling.DuplicateBookException;
import libraryManagement.exceptionHandling.GenreException;
import libraryManagement.exceptionHandling.RemoveException;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> books;

    int count = 0;


    public Library() {
        books = new ArrayList<>();
    }


    public void add(Book book) throws DuplicateBookException {
        for (Book b : books) {
            if (b.getTitle().equals(book.getTitle())) {
                System.out.println("Book with name '" + book.getTitle() + "' is already exists!!");
            }
        }
        books.add(book);
    }


    public void removeBookByTitle(String title) throws RemoveException {
        if(!books.removeIf(book -> book.getTitle().equals(title))) {
            System.out.println("No exists such kind of Book title in Inventory!!");
        }
    }


    public void displayAllBookInInventory() {
        for (Book b : books) {
            System.out.println("Title:" + b.getTitle() + ", Author:" + b.getAuthor() + ", Genre:" + b.getGenre());
        }
    }

    public void displayBookBySpecificGenre(Genre genre) throws GenreException {
        for(Book b: books) {
            if(b.getGenre() == genre) {
                System.out.println("Has been found new Data: ");
                System.out.println(b.getTitle() + ", " + b.getAuthor() + ", " + b.getGenre());
            }
        }
        count++;
        if(count != 0) {
            throw new GenreException("No such kind of genre found!");
        }
    }
}
