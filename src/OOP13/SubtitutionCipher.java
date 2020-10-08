package OOP13;
/**
 * <h1> SubtitutionCipher </h1>
 * <p>
 * This program makes a cipher character when user enter any letter.
 * Character is mixed with rules.
 *
 * @Author Minyoung Kim
 * @version 1.0
 * @e-mail ahco8766@gmail.com
 * @contact 010-4443-9023
 * <p>
 *
 * Programming Assignment 3.
 * @since 06-16-2020
 */
public class SubtitutionCipher implements MessageEncoder {
    private int shift;
    //value to shift the characters


    //one argument constructor
    public SubtitutionCipher(int shift) {
        this.shift = shift;
    }

    public String encode(String plainText) {
        //the method that takes String value as plain text and ues the method shift

        String encodedMsg = "";
        for (int i = 0; i < plainText.length(); i++) {
            char c = plainText.charAt(i);
            encodedMsg += shift(c, shift);

        }
        return encodedMsg;
    }

    private char shift(char ch, int shiftValue) {
        //the private method to shift the given character by given value
        char shiftedChar = ch;

        //if the char is in lower case
        if (ch >= 'a' && ch <= 'z') {
            shiftedChar = (char) ('a' + (ch - 'a' + shiftValue) % 26);

        } else if (ch >= 'A' && ch <= 'Z') {
            shiftedChar = (char) ('A' + (ch - 'A' + shiftedChar) % 26);

        }
        return shiftedChar;
    }

    public static void main(String[] args) {//main method is defined here

        ShuffleCipher shuffle3Times = new ShuffleCipher(3);
        System.out.println("Demonstrating cipher.");
        String plain = "A message to encode";
        System.out.println("Plain text: " + plain);

        String cipher = shuffle3Times.encode(plain);
        System.out.println("Cipher text: " + cipher);
        ShuffleCipher shuffle1 = new ShuffleCipher(1);
        ShuffleCipher shuffle2 = new ShuffleCipher(2);
        ShuffleCipher shuffle3 = new ShuffleCipher(3);
        ShuffleCipher shuffle4 = new ShuffleCipher(4);

        String test = "abcd1234";
        System.out.println("Shuffling " + test);
        System.out.println("1 shuffle: " + shuffle1.encode(test));
        System.out.println("2 shuffle: " + shuffle2.encode(test));
        System.out.println("3 shuffle: " + shuffle3.encode(test));
        System.out.println("4 shuffle: " + shuffle4.encode(test));

    }
}
