
import java.util.Scanner;
class NhanVien{
    String MaNV, HoTen;
    int LuongCoBan;
    NhanVien(){
        MaNV = "";
        HoTen = "";
        LuongCoBan = 0;
    }
    NhanVien(String Ma, String Ten, int Luong){
        MaNV = Ma;
        HoTen = Ten;
        LuongCoBan = Luong;
    }
    void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma nhan vien: ");
        MaNV = sc.nextLine();
        System.out.println("nhap ten nhan vien: ");
        HoTen = sc.nextLine();
        System.out.println("nhap luong co ban nhan vien: ");
        LuongCoBan = sc.nextInt();
        
    }
    void Xuat(){
        System.out.println(MaNV + "\t"+ HoTen+"\t"+LuongCoBan);
    }
    public int TinhLuong() {
        return LuongCoBan;
    }
}
class NhanVienVanPhong extends NhanVien{
    int SoNgayLamViec;
    NhanVienVanPhong(){
        super();
        SoNgayLamViec = 0;
    }
    NhanVienVanPhong(String Ma, String Ten, int Luong, int Ngay){
        super(Ma, Ten, Luong);
        SoNgayLamViec = Ngay;
    }
    @Override
    void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so ngay lam viec cua nhan vien: ");
        SoNgayLamViec = sc.nextInt();
    }
    @Override
    void Xuat(){
        System.out.println(MaNV + "\t\t"+ HoTen+"\t\t\t"+LuongCoBan+"\t\t"+SoNgayLamViec);
    }
    @Override
    public int TinhLuong(){ return LuongCoBan+SoNgayLamViec*50000; }
}
class NhanVienSanXuat extends NhanVien{
    int SoSanPham;
    NhanVienSanXuat(){
        super();
        SoSanPham = 0;
    }
    NhanVienSanXuat(String Ma, String Ten, int Luong, int Sp){
        super(Ma, Ten, Luong);
        SoSanPham =Sp;
    }
    @Override
    void Nhap(){
        super.Nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so san pham cua nhan vien: ");
        SoSanPham = sc.nextInt();
    }
    @Override
    void Xuat(){
        System.out.println(MaNV + "\t\t"+ HoTen+"\t\t\t"+LuongCoBan+"\t\t"+SoSanPham);
    }
    @Override
    public int TinhLuong(){return LuongCoBan+SoSanPham*30000; }
}
class DanhSach{
    NhanVien a[];
    int n;
    void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nhan vien: ");
        n = sc.nextInt();
        a = new NhanVien[n];
        for(int i=0;i<n;i++){
            int chon = 0;
            System.out.println("cho kieu nhan vien (1: nhan vien van phong, 2: nhan vien san xuat) ");
            chon = sc.nextInt();
            if(chon == 1){
                a[i] = new NhanVienVanPhong();
                System.out.println("nhap thong tin nhan vien: ");
                a[i].Nhap();
            }
            else{
                a[i] = new NhanVienSanXuat();
                System.out.println("nhap thong tin nhan vien: ");
                a[i].Nhap();
            }
        }
    }
    void Xuat_NVvanphong(){
        boolean check = false;
        System.out.println("\nDanh sach nhan vien van phong: ");
        System.out.println("Ma nhan vien\tho ten nhan vien\tluong co ban\tso ngay lam viec");
        for(int i = 0;i<n;i++){
            if(a[i] instanceof NhanVienVanPhong){
                a[i].Xuat();
                check = true;
            }
        }
        if(n==0 ||check == false ){
            System.out.println("Khong co nhan vien van phong !");
        }
    }
    void Xuat_NVsanxuat(){
        boolean check = false;
        System.out.println("\nDanh sach nhan vien san xuat: ");
        System.out.println("Ma nhan vien\tho ten nhan vien\tluong co ban\tso san pham");
        for(int i = 0;i<n;i++){
            if(a[i] instanceof NhanVienSanXuat){
                a[i].Xuat();
                check = true;
            }
        }
        if(n==0 ||check == false ){
            System.out.println("Khong co nhan vien san xuat!");
        }
    }
    void Tinhluong(){
        System.out.println("bang luong nhan vien: ");
        System.out.println("Ma nhan vien\tho ten nhan vien\tluong nhan vien");
        for(int i=0;i<n;i++){
            System.out.println(a[i].MaNV+"\t\t"+a[i].HoTen+"\t\t\t"+a[i].TinhLuong());
        }
    }
    void Tim_ma(){
        Scanner sc =new Scanner(System.in);
        System.out.println("nhap ma nhan vien can tim: ");
        boolean tim = false;
        String s = sc.nextLine();
        for(int i = 0;i<n;i++){
            if(a[i].MaNV.equals(s)){
                System.out.println("tim thay nhan vien co ma "+s);
                a[i].Xuat();
                tim = true;
            }
        }
        if(tim == false){
            System.out.println("khong tim thay nhan vien co ma duoc nhap !");
        }
    }
    void Them_nhap_vien(){
        Scanner sc = new Scanner(System.in);
        NhanVien[] b = new NhanVien[n + 1];
        for (int i = 0; i < n; i++) {
           b[i] = a[i];
        }
        System.out.println("Chon kieu nhan vien can them (1: Van phong, 2: San xuat): ");
        int chon = sc.nextInt();
        if (chon == 1) {
           b[n] = new NhanVienVanPhong();
        } else {
           b[n] = new NhanVienSanXuat();
        }
        System.out.println("Nhap thong tin nhan vien moi:");
        b[n].Nhap();
        a = b;
        n++;
    }
}
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSach A = new DanhSach();
        int Chon = -1;
        while(Chon != 0 ){
            System.out.println("=======MENU ung dung========");
            System.out.println("1: nhap danh sach nhan vien \n2: xuat danh sach nhan vien san xuat \n3: xuat danh sach nhan vien van phong \n4: danh sach luong cac nhan vien \n5: tim nhan vien theo ma\n6: them nhan vien");
            System.out.print("Chon chuc nang: ");
            Chon = sc.nextInt();
            switch (Chon) {
                case 1:
                    A.Nhap();
                    break;
                case 2:
                    A.Xuat_NVsanxuat();
                    break;
                case 3:
                    A.Xuat_NVvanphong();
                    break;
                case 4:
                    A.Tinhluong();
                    break;
                case 5:
                    A.Tim_ma();
                    break;
                case 6:
                    A.Them_nhap_vien();
                default:
                    break;
            }
        }
        sc.close();
    }
}
