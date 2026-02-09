package tinh_tru_tuong;
// import java.util.Scanner;
public class DoanThang implements IShape{
    private Diem x,y;
    public DoanThang(){}
    public DoanThang(Diem x,Diem y){
        this.x = x;
        this.y = y;
    }
    @Override
    public double dienTich() {
        return 0;
    }
    @Override
    public double chuVi() {
        return x.khoangCach(y);
    }
    @Override
    public void tinhTien2(double dX, double dY) {
        this.x.tinhTien2(dX, dY);
        this.y.tinhTien2(dX, dY);
    }
    @Override
    public IShape tinhTien(double dX, double dY) {
        return new DoanThang(x.tinhTien(dX, dY), y.tinhTien(dX, dY));
    }
    @Override
    public void nhap() {
        x = new Diem();
        y = new Diem();
        x.nhap();
        y.nhap();
    }
    public String toString(){
        return "DoanThang [x=" + x + ", y=" + y 
           + ", do dai=" + chuVi() + "]";
    }

}
