package ch21_exception.conveni;

public class InvalidOrderQuantityException extends RuntimeException {
    public InvalidOrderQuantityException(String message) {
        super(message);
    }
}
