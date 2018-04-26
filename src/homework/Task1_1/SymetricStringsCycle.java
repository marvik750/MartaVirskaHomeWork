package homework.Task1_1;

import java.util.Scanner;

public class SymetricStringsCycle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadiet simbolu virkni");
        String stringToCheck = scanner.next();

        char[] arrayToCheck = stringToCheck.toCharArray();
        if (isStringLengthEven(stringToCheck) == true) {
            evenCompare(arrayToCheck);
        } else {
            oddCompare(arrayToCheck);
        }

    }

    public static void evenCompare(char[] array) {
        int i = 0;
        int j = array.length-1;
        boolean isSymetric=true;

        while (i <= array.length / 2) {
            if (array[i] != array[j]) {
                isSymetric = false;
                break;
            }
            isSymetric = true;
            i++;
            j--;
        }
        result(isSymetric);
    }

    public static void oddCompare(char[] array) {
        int i = 0;
        int j = array.length-1;
        boolean isSymetric=true;

        while (i < array.length / 2) {
            if (array[i] != array[j]) {
                isSymetric = false;
                break;
            }
            isSymetric = true;
            i++;
            j--;
        }
        result(isSymetric);
    }

    public static void result (boolean check){
        if( check==true){
            System.out.println("ir simetriska");}
        else {System.out.println("nav simetriska");}

    }

    public static boolean isStringLengthEven(String str) {
        if (str.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}