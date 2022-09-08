import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Cipher ciph = new Cipher();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter text to encode: ");
        String plainText = sc.nextLine();
        ciph.encode(plainText);
        
        String encryptedText = ciph.getEncodedText();
        System.out.println("Encoded Data: " +encryptedText);

        System.out.println("Enter text to decode: ");
        String encodedText = sc.nextLine();
        ciph.decode(encodedText);
        
        String decipheredText = ciph.getDecodedText();
        System.out.println("Decoded Text: " +decipheredText);

    }
}
