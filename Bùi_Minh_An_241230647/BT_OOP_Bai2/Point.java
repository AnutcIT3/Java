package Bùi_Minh_An_241230647.BT_OOP_Bai2;

import java.util.Scanner;
public class Point {
    private double x,y;
    public Point(){}
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "("+x+" , "+y+")";
    }
    public double getX(){ return x; }
    public double getY(){ return y; }
    public void setX(double x){ this.x = x; }
    public void setY(double y){ this.y = y; }
    public double khoangCach(Point A){
        return Math.sqrt(Math.pow(this.x-A.x,2)+Math.pow(this.y-A.y,2));
    }
}
