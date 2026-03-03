<<<<<<< HEAD
// package Games;

// import javax.swing.JFrame;
// import javax.swing.JPanel;
// import java.awt.Graphics;
// import java.awt.Color;
// import java.awt.Dimension;


// public class Snake extends JFrame {
//     public Snake(){
//         this.pack();
//         this.setTitle("Snake");
//         this.setLocationRelativeTo(null);
//         this.setResizable(true);
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setVisible(true);

//     }
// }

// class WindowPanel extends JPanel{
//     public static final int M_TILE = 20;
//     public static final int M_WIDTH  = M_TILE*25;
//     public static final int M_HEIGHT  = M_TILE*25;

//     @Override
//     public void paintComponent(Graphics g){
//         super.paintComponent(g);
//         //grid
//         g.setColor(Color.GREEN);
//         for(int i = 0;i<M_WIDTH;i+=M_TILE){
//             for(int j=0;j<M_HEIGHT;j+=M_TILE){
//                 g.drawRect(i, j, M_TILE, M_TILE);
//             }
//         }
//         g.dispose();
//     }

//     public WindowPanel(){
//         this.setPreferredSize(new Dimension(M_WIDTH,M_HEIGHT));
//     }
// }
// class Consts{
//     public static final int WIDTH = 1000;
//     public static final int HEIGHT  = 550; 
// }
=======
package Games;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;


public class Snake extends JFrame {
    public Snake(){
        this.add( new WindowPanel() );
        this.pack();
        this.setTitle("Snake");
        this.setLocationRelativeTo(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
    public static void main(String[] args) {
        new Snake();
    }
}

class WindowPanel extends JPanel{
    public static final int M_TILE = 20;
    public static final int M_WIDTH  = M_TILE*25;
    public static final int M_HEIGHT  = M_TILE*25;

    private int m_iFruitX, m_iFruitY;
    private int[] m_iSnakeX, m_iSnakeY;
    private int m_iSnakeLength = 1;

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //grid
        g.setColor(Color.WHITE);
        for(int i = 0;i<M_WIDTH;i+=M_TILE){
            for(int j=0;j<M_HEIGHT;j+=M_TILE){
                g.drawRect(i, j, M_TILE, M_TILE);
            }
        }
        //Snake
        g.setColor(Color.GREEN);
        for(int i = 0;i<m_iSnakeLength;i++){
            g.fillRect(m_iSnakeX[i], m_iSnakeY[i], M_TILE, M_TILE);
        }
        //fruit
        g.setColor(Color.RED);
        g.fillRect(m_iFruitX, m_iFruitY, M_TILE, M_TILE);
        g.dispose();

    }

    public WindowPanel(){
        this.setFocusable( true );
        this.setDoubleBuffered(true);
        this.setPreferredSize(new Dimension(M_WIDTH,M_HEIGHT));
        this.setBackground(Color.BLACK);
        m_iFruitX = new java.util.Random().nextInt(M_WIDTH/M_TILE)*M_TILE;
        m_iFruitY = new java.util.Random().nextInt(M_HEIGHT/M_TILE)*M_TILE;
        m_iSnakeX = new int[200];
        m_iSnakeY = new int[200];
    }
}
class Consts{
    public static final int WIDTH = 1000;
    public static final int HEIGHT  = 550; 
}
>>>>>>> 1d3525c (cap nhat code)
