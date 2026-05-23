package Book;
import java.util.Scanner;

public class BookReaderWriter {
    private Scanner scanner;

    public BookReaderWriter(Scanner scanner) {
        this.scanner = scanner;
    }

   
    public Book readRecord() {
        if (scanner.hasNext()) {
            String name = scanner.next();
            int numOfPages = scanner.nextInt();
            double price = scanner.nextDouble();
            return new Book(name, numOfPages, price);
        }
        return null;
    }


    public void writeRecord(Book book) {
        if (book != null) {
            System.out.println(book.toString());
        }
    }
}