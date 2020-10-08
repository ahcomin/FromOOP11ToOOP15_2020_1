package OOP13;

public class DivideByZeroException extends Exception {//?ㅇㅅㅇ?
    public DivideByZeroException() {

        super("Dividing by zero!");
    }

    public DivideByZeroException(String message) {
        super(message);
    }
}
