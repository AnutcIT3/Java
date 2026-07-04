package Laptrinhonline;

import java.util.Scanner;

public class TuoicuaBang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        
        // Tính toán và in kết quả ra màn hình
        System.out.print((a + b) * c - b);
        
        // Đóng scanner sau khi sử dụng xong
        sc.close();
    }
}