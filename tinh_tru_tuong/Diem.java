package tinh_tru_tuong;

import java.util.Scanner;

public class Diem implements IShape{
    private double x,y;
    public Diem(){}
    public Diem(double x, double y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "("+x+" , "+y+")";

    }
    @Override
    public double dienTich() {
        return 0;
    }
    @Override
    public double chuVi() {
        return 0;
    }
    @Override
    public void tinhTien2(double dX, double dY) {
        this.x += dX;
        this.y += dY;
    }
    @Override
    public Diem tinhTien(double dX, double dY) {
        return new Diem(this.x+dX,this.y+dY);
    }
    public double khoangCach(Diem A){
        return Math.sqrt(Math.pow(this.x-A.x,2)+Math.pow(this.y-A.y,2));
    }
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        x =sc.nextDouble();
        y=sc.nextDouble();

    }
   
}