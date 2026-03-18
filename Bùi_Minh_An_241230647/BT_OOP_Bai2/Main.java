package Bùi_Minh_An_241230647.BT_OOP_Bai2;
public class Main {
    public static void main(String[] args) {
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Line line = new Line(A, B);

        Point P = new Point(2, 2);

        System.out.println("Khoang cach: " + line.distanceTo(P));
        System.out.println("Tam: " + line.getCenter());

        line.scale(2);
        System.out.println("Sau scale: " + line);

        line.rotate(90);
        System.out.println("Sau rotate: " + line);
    }
}