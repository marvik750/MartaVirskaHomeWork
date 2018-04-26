package homework.Task1_1;

import java.util.Scanner;

public class SymetricStringsSubstringCompare { //typo

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadiet simbolu virkni");
        String stringToCheck = scanner.next();
        //salidzināšana ar true nav nepieciešama, jo isStringLengthEven jau atgriež boolean
//        if (isStringLengthEven(stringToCheck) == true) {
        if (isStringLengthEven(stringToCheck)) {
            evenCompare(stringToCheck);
        } else {
            oddCompare(stringToCheck);
        }
    }

    public static void evenCompare(String inputString) { //even - pāra
        String halfString = inputString.substring(inputString.length() / 2);
        String invertedHalfString = new StringBuilder(halfString).reverse().toString();
        String firstHalfString = inputString.substring(0, (inputString.length() / 2));
        result(firstHalfString, invertedHalfString);
    }

    private static String getHalf(String inputString) {
        return inputString.substring(inputString.length() / 2);
    }

    public static void oddCompare(String inputString) { //odd - nepāra
        String halfString = inputString.substring((inputString.length() + 1) / 2);
        String invertedHalfString = new StringBuilder(halfString).reverse().toString();
        String firstHalfString = inputString.substring(0, ((inputString.length() - 1) / 2));
        result(firstHalfString, invertedHalfString);
    }

    public static void result(String str1, String str2) {
        /*if (str1.equals(str2)) {
            System.out.println("simbolu virkne ir simetriska");
        } else {
            System.out.println("simbolu virkne nav simetriska");
        }*/
        System.out.println(str1.equals(str2)
                                   ? "simbolu virkne ir simetriska"
                                   : "simbolu virkne nav simetriska");

    }

    public static boolean isStringLengthEven(String str) {
        /*if (str.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }*/
        //šādi būs kodolīgāk
        return str.length() % 2 == 0;
    }
}