package OOP13;

public interface MessageEncoder {
    //This method takes a String variable as plain text,
    //then encodes and returns it as encoded message.
    public abstract String encode(String plainText);
}
