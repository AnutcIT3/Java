package tinh_tru_tuong_2;

import java.util.Scanner;

public class NhanVienVanPhong extends NgayThang implements NhanVien {
    private String MaNV, HoTen;
    private int LuongCoBan;
    private int SoNgayLamViec;
    @Override
    public String getMaNV() {
        return MaNV;
    }

    @Override
    public String getHoTen() {
        return HoTen;
    }

    @Override
    public int getLuong() {
        return LuongCoBan + 50000*SoNgayLamViec;
    }
 
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma nhan vien: ");
        MaNV = sc.nextLine();
        System.out.println("nhap ten nhan vien: ");
        HoTen = sc.nextLine();
        System.out.println("nhap luong co ban nhan vien: ");
        LuongCoBan = sc.nextInt();
        System.out.println("nhap so ngay lam viec cua nhan vien: ");
        SoNgayLamViec = sc.nextInt();
        super.nhap();
    }

    @Override
    public void xuat() {
        System.out.println(MaNV + "\t\t"+ HoTen+"\t\t\t"+LuongCoBan+"\t\t"+SoNgayLamViec);
    }
    public String toString(){
        return MaNV + "\t\t"+ HoTen+"\t\t\t"+LuongCoBan+"\t\t"+SoNgayLamViec;
    }
    @Override
    public String NgaySinhNhanVien(){
        return ngay+"/"+thang+"/"+nam;
    }
}
  