package Bùi_Minh_An_241230647.BT_OOP_Bai2;
public class Circle implements IShape {
    private Point center;
    private double radius;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
    }

    // khoảng cách từ điểm đến hình tròn
    public double distanceTo(Point p){
        return Math.max(0, center.khoangCach(p) - radius);
    }

    public Point getCenter(){
        return center;
    }

    public void scale(double factor){
        radius *= factor;
    }

    public void rotate(double angle){
        // hình tròn xoay không đổi
    }

    public String toString(){
        return "Circle: center=" + center + ", r=" + radius;
    }
}
