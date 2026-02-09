package tinh_tru_tuong_2;

import java.util.Scanner;

public class NhanVienSanXuat extends NgayThang implements NhanVien {
    private String MaNV, HoTen;
    private int LuongCoBan;
    private int SoSanPham;
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
        return LuongCoBan + SoSanPham*30000;
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
        System.out.println("nhap so san pham cua nhan vien: ");
        SoSanPham = sc.nextInt();
        super.nhap();
    }

    @Override
    public void xuat() {
        System.out.println(MaNV + "\t\t"+ HoTen+"\t\t\t"+LuongCoBan+"\t\t"+SoSanPham);
    }
    public String toString(){
        return MaNV + "\t\t"+ HoTen+"\t\t\t"+LuongCoBan+"\t\t"+SoSanPham;
    }

    @Override
    public String NgaySinhNhanVien() {
        return ngay+"/"+thang+"/"+nam;
    }
    
}
