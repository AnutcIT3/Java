package Laptrinhonline;

import java.util.Scanner;

public class Hotel {
    public static int hotel(int N, int K, int X, int Y) {
        int chiphi = 0;
        for (int i = 1; i <= N; i++) {
            if (i > K) {
                chiphi += Y;
            } else {
                chiphi += X;
            }
        }
        return chiphi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int N = scanner.nextInt();
            int K = scanner.nextInt();
            int X = scanner.nextInt();
            int Y = scanner.nextInt();

            System.out.println(hotel(N, K, X, Y));
        }
        
        scanner.close();
    }
}
