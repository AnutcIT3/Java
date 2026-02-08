
public class  Diem2D {
    private double x,y;
    public double KhoangCach(Diem2D A){
        double khoangcach;
        khoangcach = Math.sqrt(Math.pow(this.x-A.x,2)+Math.pow(this.y-A.y,2));
        return khoangcach;
    }
    public Diem2D(){}
    public Diem2D(double a,double b){
        x=a;y=b;
    }
    public Diem2D DiemDoiXungGocToaDo(){
        Diem2D a;
        a = new Diem2D();
        // a.Setx(-x);
        a.x = -this.x;
        a.Sety(-y);
        return a;

    }
    public Diem2D TinhTien(double a, double b){
        return new Diem2D(x+a,y+b);
    }
    public void Setx(double a){
        this.x = a;
    }
    public void Sety(double b){
        this.y = b;
    }
    public double Getx(){
        return this.x;
    }
    public double Gety(){
        return this.y;
    }
    public boolean KiemTra(Diem2D A){
        return x == -A.x && y == -A.y;
    }  
}
