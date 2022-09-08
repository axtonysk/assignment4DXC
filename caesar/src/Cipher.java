public class Cipher {

    private String encodedText;
    private String decodedText;
    private static String caesarString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789()*+,-./";

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
            int currentIndex = caesarString.indexOf(actual.charAt(i));
            int encryptedIndex = (43+currentIndex-shift1) % 43;

            char encryptedChar = caesarString.charAt(encryptedIndex);
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
            int currentIndex = caesarString.indexOf(actual.charAt(i));
            int decryptedIndex = (currentIndex + shift1) % 43;

            char decryptedChar = caesarString.charAt(decryptedIndex);
            decrypted = decrypted + decryptedChar;
        }
        this.decodedText = decrypted;
    }
}
