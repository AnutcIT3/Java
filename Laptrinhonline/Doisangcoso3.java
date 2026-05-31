package Laptrinhonline;

import java.util.Scanner;

public class Doisangcoso3 {
    // Hàm chuyển đổi từ thập phân sang cơ số 3
    public static String decToBase3(long n) {
        if (n == 0) return "0"; 
        
        // Sử dụng StringBuilder trong Java để tối ưu hiệu năng nối chuỗi
        StringBuilder base3 = new StringBuilder();
        
        while (n > 0) {
            int remainder = (int) (n % 3);
            base3.insert(0, remainder); // Chèn số dư vào đầu chuỗi
            n /= 3;
        }
        
        return base3.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t > 0) {
                long n = sc.nextLong();
                System.out.println(decToBase3(n));
                t--;
            }
        }
        
        sc.close();
    }
}
