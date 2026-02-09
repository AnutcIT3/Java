package tinh_tru_tuong;

import java.util.Scanner;

public class HinhChuNhat implements IShape {
    private double cr,cd;
    private Diem tam;
    public HinhChuNhat(){}
    public HinhChuNhat(double cr, double cd, Diem tam){
        this.cd = cd;
        this.cr = cr;
        this.tam = tam;
    }
    @Override
    public double dienTich() {
        return cd*cr;
    }
    @Override
    public double chuVi() {
        return cr*2+cd*2;
    }
    @Override
    public void tinhTien2(double dX, double dY) {
        this.tam.tinhTien2(dX, dY);
    }
    @Override
    public IShape tinhTien(double dX, double dY) {
        return new HinhChuNhat(cr, cd, tam.tinhTien(dX, dY));
    }
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        cr = sc.nextDouble();
        cd = sc.nextDouble();
        tam = new Diem();
        tam.nhap();
    }
    @Override
    public String toString() {
        return "HinhChuNhat [tam=" + tam
           + ", cr=" + cr
           + ", cd=" + cd
           + ", dien tich=" + dienTich()
           + ", chu vi=" + chuVi() + "]";
    }
    public double khoangCach(HinhChuNhat A){
        return this.tam.khoangCach(A.tam);
    }

}
