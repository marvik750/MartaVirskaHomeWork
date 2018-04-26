package homework.Task1_1;

import java.util.Scanner;

public class StringConvert {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadiet skaitļu virkni virkni");
        String numberString = scanner.nextLine();
        //String reg = "jdkkasfdf afsdcdxojsdafc sdxsdx";


        String [] stringParts = numberString.split("\\s+");
        //String [] stringParts = StringUtils.split (numberString);

        System.out.println(stringParts.length);
        System.out.println(stringParts[1]);
        System.out.println(numberString);
       // System.out.println(stringParts[2]);
    }
}