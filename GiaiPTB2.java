import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class GiaiPTB2 {

    public GiaiPTB2() {
        JFrame frame = new JFrame("Giải phương trình bậc 2");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 2, 10, 10));

        // Label + TextField
        JLabel lblA = new JLabel("Nhập a:");
        JTextField txtA = new JTextField();

        JLabel lblB = new JLabel("Nhập b:");
        JTextField txtB = new JTextField();

        JLabel lblC = new JLabel("Nhập c:");
        JTextField txtC = new JTextField();

        JLabel lblKQ = new JLabel("Kết quả:");

        JButton btnGiai = new JButton("Giải");

        // Xử lý sự kiện
        btnGiai.addActionListener(e -> {
            try {
                double a = Double.parseDouble(txtA.getText());
                double b = Double.parseDouble(txtB.getText());
                double c = Double.parseDouble(txtC.getText());

                if (a == 0) {
                    if (b == 0) {
                        lblKQ.setText(c == 0 ? "Vô số nghiệm" : "Vô nghiệm");
                    } else {
                        lblKQ.setText("Nghiệm: x = " + (-c / b));
                    }
                } else {
                    double delta = b * b - 4 * a * c;
                    if (delta < 0) {
                        lblKQ.setText("Phương trình vô nghiệm");
                    } else if (delta == 0) {
                        double x = -b / (2 * a);
                        lblKQ.setText("Nghiệm kép: x = " + x);
                    } else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        lblKQ.setText("x1 = " + x1 + ", x2 = " + x2);
                    }
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(frame,
                        "Vui lòng nhập số hợp lệ!",
                        "Lỗi",
                        JOptionPane.ERROR_MESSAGE);
            }
        });

        // Thêm vào frame
        frame.add(lblA);
        frame.add(txtA);
        frame.add(lblB);
        frame.add(txtB);
        frame.add(lblC);
        frame.add(txtC);
        frame.add(btnGiai);
        frame.add(lblKQ);

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new GiaiPTB2();
    }
}
