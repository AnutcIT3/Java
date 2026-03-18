package Bùi_Minh_An_241230647.BT_OOP_Bai1;

public class DoanThang {
    private double thamso1;
    private double thamso2;
    public DoanThang(){}
    public DoanThang(double a, double b){
        thamso1 = a;
        thamso2 = b;
    }
    public String toString(){
        if(thamso2>0){
            return "y = "+thamso1+"x +"+thamso2;
        }
        else{
            return "y = "+thamso1+"x "+thamso2;
        }
    }
    public void setThamso1(double thamso1) {
        this.thamso1 = thamso1;
    }
    public void setThamso2(double thamso2) {
        this.thamso2 = thamso2;
    }
    public double getThamso1() {
        return thamso1;
    }
    public double getThamso2() {
        return thamso2;
    }
    public double kcGoc(){
        double d = Math.abs(thamso2) / Math.sqrt(thamso1 * thamso1 + 1);
        return d;
    }
    public boolean Diem(double x,double y){
        return y == thamso1*x+thamso2;
    }
    

}
