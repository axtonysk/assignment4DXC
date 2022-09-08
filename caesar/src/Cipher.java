import java.util.*;

public class Cipher {

    private String encodedText;
    private String decodedText;

    public String getEncodedText() {
        return encodedText;
    }
    public String getDecodedText() {
        return decodedText;
    }

    public void encode(String text) {
        char shift = text.charAt(0);
        int shift1 = shift-'A';
        String actual = text.substring(1);

        String encrypted = "";
        for(int i=0; i<text.length()-1; i++) {
            int currentChar = actual.charAt(i);
            char encryptedChar = (char)(currentChar - shift1);

            encrypted = encrypted + encryptedChar;
        }
        this.encodedText = encrypted;
    }

    public void decode(String text) {
        char shift = text.charAt(0);
        int shift1 = shift-'A';
        String actual = text.substring(1);

        String decrypted = "";
        for(int i=0; i<text.length()-1; i++) {
            int currentChar = actual.charAt(i);
            char decryptedChar = (char)(currentChar + shift1);

            decrypted = decrypted + decryptedChar;
        }
        this.decodedText = decrypted;
    }
}
