package homework.Task1_1;

import java.util.Scanner;

public class StringEncryption {

    static int encryptionKey = 5;
    static String symbols = "aābcčdeēfghiījkķlļmnņoprsštuūvzž 1234567890";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadiet virkni, ko jāšifrē");
        String stringToEncrypt = scanner.nextLine();
        stringEncrypt(stringToEncrypt);

        System.out.println("ievadiet virkni, ko jāatšifrē");
        String stringToDecrypt = scanner.nextLine();
        stringDecrypt(stringToDecrypt);

    }

    public static void stringDecrypt(String inputString) {
        String decryptedString = "";

        for (int i = 0; i < inputString.length(); i++) {
            if ((symbols.indexOf(inputString.charAt(i)) - encryptionKey) < 0) {
                decryptedString += (symbols.charAt((symbols.length()) + (symbols.indexOf(inputString.charAt(i)) - encryptionKey)));
            } else {
                decryptedString += (symbols.charAt(symbols.indexOf(inputString.charAt(i)) - encryptionKey));
            }
        }
        System.out.println(decryptedString);
    }


    public static void stringEncrypt(String inputString) {
        String encryptedString = "";

        for (int i = 0; i < inputString.length(); i++) {
            if ((symbols.indexOf(inputString.charAt(i)) + encryptionKey) > (symbols.length() - 1)) {
                encryptedString += (symbols.charAt((symbols.indexOf(inputString.charAt(i)) + encryptionKey) - (symbols.length())));
            } else {
                encryptedString += (symbols.charAt(symbols.indexOf(inputString.charAt(i)) + encryptionKey));
            }
        }
        System.out.println(encryptedString);
    }
}