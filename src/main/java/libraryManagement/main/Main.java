package libraryManagement.main;

import libraryManagement.entity.Book;
import libraryManagement.allEnums.Genre;
import libraryManagement.exceptionHandling.*;
import libraryManagement.libraryImpl.Library;

public class Main {
    public static void main(String[] args) {


        Library library = new Library();

        try {
            library.add(new Book("Bir Shey", "Cey Papazan", Genre.SCIENCE_FICTION));
            library.add(new Book("Ne Ichin Varsan Onun Ichin Yasha", "H.A.Oztekin", Genre.NON_FICTION));
            library.add(new Book("Feslegen", "H.A.Oztekin", Genre.SCIENCE_FICTION));
            library.add(new Book("Steve Jobs", "A.V.S", Genre.NON_FICTION));
            library.add(new Book("Elon Musk", "V.S.A", Genre.NON_FICTION));
        } catch (DuplicateBookException db) {
            System.out.println("Error: " + db.getMessage());
        }


        try {
            System.out.println("Removing is on process...");
            library.removeBookByTitle("Stcdsceve Jobs");
        } catch (RemoveException re) {
            System.out.println("Error message: " + re.getMessage());
        }

        System.out.println();


        System.out.println("Displaying all Books is on process...");
        library.displayAllBookInInventory();

        System.out.println();


        try{
            System.out.println("Displaying by Genre is on process...");
            library.displayBookBySpecificGenre(Genre.FICTION);
        } catch (GenreException ge) {
            System.out.println(ge.getMessage());
        }
    }
}
