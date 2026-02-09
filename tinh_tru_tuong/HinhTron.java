package tinh_tru_tuong;

import java.util.Scanner;

public class HinhTron implements IShape {
    Diem tam;
    double r;
    HinhTron(){}
    HinhTron(double r,Diem tam){
        this.tam = tam;
        this.r = r;
    }
    @Override
    public double dienTich() {
        return r*r*3.14;
    }
    @Override
    public double chuVi() {
        return r*2*3.14;
    }
    @Override
    public void tinhTien2(double dX, double dY) {
        this.tam.tinhTien2(dX, dY);
    }
    @Override
    public IShape tinhTien(double dX, double dY) {
        return new HinhTron(r, tam.tinhTien(dX, dY));
    }
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        r = sc.nextDouble();
        tam = new Diem();
        tam.nhap();
       
    }
    public String toString(){
        return "HinhTron [tam=" + tam
           + ", r=" + r
           + ", dien tich=" + dienTich()
           + ", chu vi=" + chuVi() + "]";
    }
    public double khoangCach(HinhTron A){
        return this.tam.khoangCach(A.tam);
    }
}
