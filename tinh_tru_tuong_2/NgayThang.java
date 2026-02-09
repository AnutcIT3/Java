package tinh_tru_tuong_2;

import java.util.Scanner;

public class NgayThang {
    int ngay,thang,nam;
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ngay sinh: ");
        ngay = sc.nextInt();
        System.out.println("nhap thang sinh: ");
        thang = sc.nextInt();
        System.out.println("nhap nam sinh: ");
        nam = sc.nextInt();
    }
    public String toString(){
        if(ngay<10 && thang<10)
            return  "0"+ngay+" / "+"0"+thang+" / "+nam;
        else if(ngay<10 && thang>=10)
            return "0"+ngay+" / "+thang+" / "+nam;
        else if(ngay>=10 && thang<10)
            return ngay+" / 0"+thang+" / "+nam;
        else 
            return ngay+" / "+thang+" / "+nam;
    } 
    public int getNgay(){ return ngay; }
    public int getThang(){ return thang; }
    public int getNam(){ return nam; }
} 


