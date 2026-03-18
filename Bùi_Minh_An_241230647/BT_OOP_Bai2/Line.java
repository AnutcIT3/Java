package Bùi_Minh_An_241230647.BT_OOP_Bai2;

public class Line implements IShape {
    private Point A, B;

    public Line(Point A, Point B){
        this.A = A;
        this.B = B;
    }

    public double distanceTo(Point p){
        double x0 = p.getX(), y0 = p.getY();
        double x1 = A.getX(), y1 = A.getY();
        double x2 = B.getX(), y2 = B.getY();

        double num = Math.abs((y2 - y1)*x0 - (x2 - x1)*y0 + x2*y1 - y2*x1);
        double den = Math.sqrt(Math.pow(y2 - y1, 2) + Math.pow(x2 - x1, 2));

        return num / den;
    }

    public Point getCenter(){
        return new Point((A.getX()+B.getX())/2, (A.getY()+B.getY())/2);
    }

    public void scale(double factor){
        Point c = getCenter();
        A.setX(c.getX() + (A.getX() - c.getX()) * factor);
        A.setY(c.getY() + (A.getY() - c.getY()) * factor);

        B.setX(c.getX() + (B.getX() - c.getX()) * factor);
        B.setY(c.getY() + (B.getY() - c.getY()) * factor);
    }


    public void rotate(double angle){
        double rad = Math.toRadians(angle);
        Point c = getCenter();

        A = rotatePoint(A, c, rad);
        B = rotatePoint(B, c, rad);
    }

    private Point rotatePoint(Point p, Point c, double rad){
        double x = p.getX() - c.getX();
        double y = p.getY() - c.getY();

        double newX = x*Math.cos(rad) - y*Math.sin(rad);
        double newY = x*Math.sin(rad) + y*Math.cos(rad);

        return new Point(newX + c.getX(), newY + c.getY());
    }

    public String toString(){
        return "Line: " + A + " - " + B;
    }
}