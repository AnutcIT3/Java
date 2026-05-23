package Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BookTest82 {
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so sach"); // xóa nếu không cần
        BookReaderWriter rw = new BookReaderWriter(sc);   
        if (!sc.hasNextInt()) {
            sc.close();
            return;
        }
        int n = sc.nextInt();
        List<Book> bookList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("nhap thong tin sach %d\n",i+1); //xóa nếu ko cần
            Book b = rw.readRecord();
            if (b != null) {
                bookList.add(b);
            }
        }
        Collections.sort(bookList); 
        for (Book book : bookList) {
            rw.writeRecord(book);
        }
        sc.close();
    }
}