package OOP13;

public class ShuffleCipher implements MessageEncoder {
    private int n;//number of iterations to shuffle

    //one argument constructor takes the shuffle value
    public ShuffleCipher(int n) {
        this.n = n;
    }

    /*
    The method encode takes a value as plain text and use the method shuffle
    with the String to shuffle for n - number of times.
     */
    public String encode(String plainText) {
        String encodeText = plainText;
        for (int i = 0; i < n; i++)
            encodeText = shuffle(encodeText);
        return encodeText;
    }

    public String shuffle(String text) {//take a plain text message and returns the given text for a single time
        int mid;
        if (text.length() % 2 == 0)
            mid = text.length() / 2;
        else
            mid = (text.length() + 1) / 2;

        //first half of given string
        String first = text.substring(0, mid);
        //second half
        String second = text.substring(mid);

        String shuffled = "";
        // for loop to create a message of shuffled String for one time.

        for (int i = 0, j = 0; i < first.length(); i++, j++) {
            shuffled += first.charAt(i);
            if (j < second.length())
                shuffled += second.charAt(i);
        }
        return shuffled;
    }


}
