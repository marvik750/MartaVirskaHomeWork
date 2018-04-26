
package homework.Task1_1;
import java.util.Scanner;

public class StringConcatenationTime {


    public static void main(String[] args) {
        int repeatTimes = 100000;
        Scanner scanner = new Scanner(System.in);
        System.out.println("ievadiet pirmo simbolu virkni");
        String firstString = scanner.next();
        System.out.println("ievadiet otro simbolu virkni");
        String secondString = scanner.next();

        firstTask(firstString, secondString); //slikt metodes nosaukums - labāk stringConcatenation būtu
        timeWithConcatenation(firstString, secondString, repeatTimes);
        timeWithStringBuffer(firstString, secondString, repeatTimes);
        timeWithStringBuilder(firstString, secondString, repeatTimes);

    }

    public static void firstTask(String firstString, String secondString) {
        String newString = firstString.concat(secondString);
        System.out.println("Savienotā simbolu virkne(pirmais uzdevums): " + newString);
    }

    public static void timeWithConcatenation(String firstString, String secondString, int repeatTimes) {
        long startTime = System.nanoTime();
        for (int i = 1; i < repeatTimes; i++) {
//            String newString = firstString.concat(secondString);  // neizmantots mainīgais
            firstString.concat(secondString);
        }
//        long endTime = System.nanoTime();  // nav nepieciešams šis mainīgais
//        long concatenationTime = endTime - startTime;
        System.out.println("Savienošanas laiks, izmantojot vienkāršu konkatenāciju: "
                                   + calculateUsedTime(startTime, System.nanoTime()));
    }

    private static long calculateUsedTime(long startTime, long endTime) {
        return endTime - startTime;
    }

    public static void timeWithStringBuffer(String firstString, String secondString, int repeatTimes) {
        long startTime = System.nanoTime();
        for (int i = 1; i < repeatTimes; i++) {
            StringBuffer newString = new StringBuffer();
            newString.append(firstString);
            newString.append(secondString);
        }
        long endTime = System.nanoTime();
        long concatenationTime = endTime - startTime;
        System.out.println("Savienošanas laiks, izmantojot String Buffer: " + concatenationTime);
    }

    public static void timeWithStringBuilder(String firstString, String secondString, int repeatTimes) {
        long startTime = System.nanoTime();
        for (int i = 1; i < repeatTimes; i++) {
            StringBuilder newString = new StringBuilder();
            newString.append(firstString);
            newString.append(secondString);
        }
        long endTime = System.nanoTime();
        long concatenationTime = endTime - startTime;
        System.out.println("Savienošanas laiks, izmantojot String Builder: " + concatenationTime);
    }
}