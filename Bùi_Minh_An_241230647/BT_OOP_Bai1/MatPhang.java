package Bùi_Minh_An_241230647.BT_OOP_Bai1;

public class MatPhang {
    private double a, b, c;


    public MatPhang(){}

    public MatPhang(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }

    public void setA(double a) { this.a = a; }
    public void setB(double b) { this.b = b; }
    public void setC(double c) { this.c = c; }

    public double kcGoc(){
        return Math.abs(c) / Math.sqrt(a*a + b*b + 1);
    }

  
    public boolean thuocMatPhang(double x, double y, double z){
        double eps = 1e-6;
        return Math.abs(z - (a*x + b*y + c)) < eps;
    }

 
    public String toString(){
        return "z = " + a + "x + " + b + "y + " + c;
    }
}
