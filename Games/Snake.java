package Games;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.Timer;
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

class WindowPanel extends JPanel implements ActionListener, KeyListener{
    public static final int M_TILE = 20;
    public static final int M_WIDTH  = M_TILE*25;
    public static final int M_HEIGHT  = M_TILE*25;
    public static final int M_FPS = 30;
    public static final int M_DELAY = 1000/M_FPS;

    private Timer m_timer  = new Timer(M_DELAY, this);

    private int m_iFruitX, m_iFruitY;
    private int[] m_iSnakeX, m_iSnakeY;
    private int m_iSnakeLength = 5;
    private char m_iDir = 'r';  //r,l,u,d

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
        this.addKeyListener(this);
        m_iFruitX = new java.util.Random().nextInt(M_WIDTH/M_TILE)*M_TILE;
        m_iFruitY = new java.util.Random().nextInt(M_HEIGHT/M_TILE)*M_TILE;
        m_iSnakeX = new int[200];
        m_iSnakeY = new int[200];
        m_timer.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for(int i = m_iSnakeLength; i > 0;i--){
            m_iSnakeX[i] = m_iSnakeX[i-1];
            m_iSnakeY[i] = m_iSnakeY[i-1];
        }
        if(m_iDir == 'r') m_iSnakeX[0] += M_TILE;
        if(m_iDir == 'l') m_iSnakeX[0] -= M_TILE;
        if(m_iDir == 'u') m_iSnakeY[0] -= M_TILE;
        if(m_iDir == 'd') m_iSnakeY[0] += M_TILE;
        if(m_iSnakeX[0]<0) m_iSnakeX[0] = M_WIDTH;
        if(m_iSnakeX[0]>M_WIDTH) m_iSnakeX[0] = 0;
        if(m_iSnakeY[0]<0) m_iSnakeY[0] = M_HEIGHT;
        if(m_iSnakeY[0]>M_HEIGHT) m_iSnakeY[0] = 0;
        if(m_iSnakeX[0] == m_iFruitX && m_iSnakeY[0] == m_iFruitY){
            m_iSnakeLength++;
            m_iFruitX = new java.util.Random().nextInt(M_WIDTH/M_TILE)*M_TILE;
            m_iFruitY = new java.util.Random().nextInt(M_HEIGHT/M_TILE)*M_TILE;
        }
        for(int i = m_iSnakeLength;i>0;i--){
            if(m_iSnakeX[0] == m_iSnakeX[i] && m_iSnakeY[0] == m_iSnakeY[i]){
                m_timer.stop();
            }
        }
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            if(m_iDir != 'l') m_iDir = 'r';
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            if(m_iDir != 'r') m_iDir = 'l';
        }
        else if(e.getKeyCode() == KeyEvent.VK_UP){
            if(m_iDir != 'd') m_iDir ='u';
        }
        if(e.getKeyCode() == KeyEvent.VK_DOWN){
            if(m_iDir != 'u') m_iDir = 'd';
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }
}
class Consts{
    public static final int WIDTH = 1000;
    public static final int HEIGHT  = 550; 
}

