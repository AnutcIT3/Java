package Laptrinhonline;
import java.util.Scanner;

public class Boctrung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();
        int max;
        
        if (s > t) {
            max = s;
        } else {
            max = t;
        }
        
        System.out.println(max - ((s + t) - n) + 1);
        
        sc.close(); // Đóng scanner sau khi sử dụng xong
    }
}