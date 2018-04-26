package homework.Task1_1;

import java.util.Scanner;

public class StringConvert {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadiet skaitļu virkni");
        String numberString = scanner.nextLine();
        String[] stringParts = numberString.split("\\s+");
        double sum = 0;

        for (int i = 0; i < stringParts.length; i++) {
            sum = (sum + Double.parseDouble(stringParts[i]));
        }

        System.out.println(sum);
    }
}