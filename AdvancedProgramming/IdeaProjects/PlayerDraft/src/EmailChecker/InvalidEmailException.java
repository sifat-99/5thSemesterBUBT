package EmailChecker;


class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}