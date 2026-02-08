
import java.util.Scanner;

class PhanSo {
    Scanner sc=new Scanner(System.in);
        private int tu;
        private int mau;

    public PhanSo() {
    }


    public PhanSo(int tu, int mau){
            this.tu=tu;
            this.mau=mau;
        }


    public int getTu() {
        return tu;
    }

    public int getMau() {
        return mau;
    }

    public void setTu(int tu) {
        this.tu = tu;
    }

    public void setMau(int mau) {
        this.mau = mau;
    }
    public String toString(){
        return "Phan so {"+tu+"/"+mau+"}";
    }

}
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String HoTen = sc.nextLine().trim();
        char[] arr = HoTen.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
       for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == ' ' && arr[i] != ' ') {
                arr[i] = Character.toUpperCase(arr[i]);
            } else if (arr[i] != ' ') {
                arr[i] = Character.toLowerCase(arr[i]);
            }
        }
        System.out.print("chuan hoa ten: ");
        HoTen = new String(arr);
        System.out.println(HoTen);

        String S_input = "Lap trinh Java khong don gian";
        String S = S_input.replace("a","");
        System.out.println(S);
        String R = "";
        for (int j = S.length()-1;j>=0 ; j--) {
            R += S.charAt(j);
        }
        System.out.println(R);
        sc.close();
        
    }
    // public static void main(String[] args) {
    // PhanSo ps=new PhanSo(5,7);
    // String s=ps.toString();
    //     System.out.println(s);
    // Diem2D D = new Diem2D(1,2);
    // Diem2D A = new Diem2D(3,-4);
    // Diem2D B = new Diem2D();
    // B=A.DiemDoiXungGocToaDo();
    // System.out.println(A.Getx()+" "+A.Gety());
    // System.out.println(B.Getx()+" "+B.Gety());
    // }
    }







    
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         // int[] arr = new int[n];
//         // for (int i = 0; i < n; i++) {
//         //     System.out.println("nhap ptu "+(i+1));
//         //     arr[i] = sc.nextInt();
//         // }
//         // //cau 1
//         // int s = 0;
//         // for(int i:arr){
//         //     if(i>0 && i%3!=0) s++;
//         // } 
//         // System.out.println("so phan tu duong khong chia het cho 3: "+s);

//         // //cau 2
//         // s = 0;
//         // int dem=0;
//         // for(int i:arr){
//         //     if(i>=-5 && i<=25){
//         //         s+=i;
//         //         dem++;
//         //     }
//         // }
//         // System.out.println("tong cac phan tu [-5,25]: "+s+"\ntrung binh cong: "+(s/dem));

//         // //cau 3
//         // int max = arr[0]; 
//         // for(int i:arr){
//         //     if(i%3 == 0){
//         //         if(max%3==0 && max>i) max = max;
//         //         else max = i;
//         //     }
//         // }
//         // System.out.println("phan tu lon nhat chia het cho 3:" +max);
//         // sc.close()










//         // String S_input = "Lap trinh Java khong don gian";
//         // String S = S_input.replace("a","");
//         // System.out.println(S);
//         // String R = "";
//         // for (int i = S.length()-1;i>=0 ; i--) {
//         //     R += S.charAt(i);
//         // }
//         // System.out.println(R);
//     }
// }

