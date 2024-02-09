package libraryManagement.exceptionHandling;

public class DuplicateBookException extends Throwable {

    public DuplicateBookException(String message) {
        super(message);
    }
}
