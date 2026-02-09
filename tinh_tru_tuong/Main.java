package tinh_tru_tuong;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so hinh: ");
        int n = sc.nextInt();
        IShape A[] = new IShape[n];
        for(int i = 0;i<n;i++){
            int chon = rd.nextInt(3);
            if(chon==0){
                System.out.println("Nhap thong tin hinh chu nhat: ");
                A[i] = new HinhChuNhat();
                A[i].nhap();
            }
            else if(chon == 1){
                System.out.println("Nhap thong tin hinh tron: ");
                A[i] = new HinhTron();
                A[i].nhap();
            }
            else{
                System.out.println("Nhap thong tin doan thang: ");
                A[i] = new DoanThang();
                A[i].nhap();
            }
        }
        for(IShape Hinh:A){
            System.out.println(Hinh);
        }


    }
}
