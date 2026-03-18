package Bùi_Minh_An_241230647.BT_OOP_Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        //duong thang
        int n=5;
        int dem = 0;
        double s=0;
        DoanThang A[] = new DoanThang[n];
        double x=1,y=7;
        for(int i = 0;i<n;i++){
            A[i] =new DoanThang();
            double a,b;
            a = sc.nextDouble();
            b = sc.nextDouble();
            A[i].setThamso1(a);
            A[i].setThamso2(b);
        }
        for(int i=0; i< n ; i++){
            if(A[i].Diem(x, y)) dem++;
        }
        System.out.println("so duong thang di qua diem: "+dem);
        for(int i=0;i<n;i++){
            s+=A[i].kcGoc();
        }
        System.out.println("tong khoang cach cac duong thang den goc toa do:"+s);
        //mat phang
        int m = 2;
        MatPhang[] mp = new MatPhang[m];

        for(int i = 0; i < m; i++){
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();
            mp[i] = new MatPhang(a, b, c);
        }

        double x0 = 1, y0 = 2, z0 = 3;
        int demMP = 0;

        for(int i = 0; i < m; i++){
            if(mp[i].thuocMatPhang(x0, y0, z0)) demMP++;
        }

        System.out.println("So mat phang di qua diem: " + demMP);

        double tongMP = 0;
        for(int i = 0; i < m; i++){
            tongMP += mp[i].kcGoc();
        }

        System.out.println("Tong kc mat phang den O: " + tongMP);
        sc.close();
    }
}
