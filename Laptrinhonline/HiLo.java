package Laptrinhonline;
import java.util.Scanner;
import java.util.Stack;

public class HiLo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // C++ sử dụng unsigned int (16-bit trở lên), Java sử dụng int (32-bit có dấu)
        // Với bài toán xử lý bit này, kiểu int của Java hoàn toàn đáp ứng tốt.
        int n = sc.nextInt();
        
        Stack<Integer> s = new Stack<>();
        
        // Tách 16 bit từ số n và đẩy vào Stack
        for (int i = 0; i < 16; i++) {
            s.push(n % 2);
            n /= 2;
        }
        
        // In ra 8 bit đầu tiên (8 bit cao)
        for (int i = 0; i < 8; i++) {
            System.out.print(s.pop());
        }
        
        System.out.println(); // Xuống dòng tương đương cout << endl;
        
        // In ra 8 bit tiếp theo (8 bit thấp)
        for (int i = 0; i < 8; i++) {
            System.out.print(s.pop());
        }
        
        System.out.println();
        sc.close();
    }
}