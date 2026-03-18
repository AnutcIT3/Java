package Bùi_Minh_An_241230647.BT_OOP_Bai2;

public interface IShape {
    double distanceTo(Point p); 
    Point getCenter();          
    void scale(double factor);  
    void rotate(double angle);  
}
