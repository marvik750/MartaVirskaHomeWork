package Task2;

public class MakeBooks {

    public static void main(String[] args) {

        Book myFirstBook = new Book();
        myFirstBook.setAuthor("J.R.R. Tolkien");
        myFirstBook.setYear(1955);
        myFirstBook.setTitle("\"The Lord of the Rings\" ");
        myFirstBook.setPageCount(1216);

        Book mySecondBook = new Book();
        mySecondBook.setAuthor("George Orwell");
        mySecondBook.setYear(1950);
        mySecondBook.setTitle("\"1984\"");
        mySecondBook.setPageCount(653);

        Book myThirdBook = new Book();
        myThirdBook.setAuthor("Frank Herbert");
        myThirdBook.setYear(1965);
        myThirdBook.setTitle("\"Dune\"");
        myThirdBook.setPageCount(875);

        Book myFourthBook = new Book("Ray Bradbury", 1953, "\"Fahrenheit 451\"", 954);

        System.out.println(myFirstBook);

        System.out.println("\n" + myFourthBook.getAuthor());
        System.out.println(myFourthBook.getYear());
        System.out.println(myFourthBook.getTitle());
        System.out.println(myFourthBook.getPageCount());

    }
}
