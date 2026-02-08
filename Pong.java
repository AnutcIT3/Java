// package Games;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.*;

import javax.swing.*;
public class Pong extends JFrame {
    private ControlWindow cw = new ControlWindow();
    public Pong(){
        this.add(cw);
        this.pack();
        this.setTitle("Pong");
        this.setSize(Consts.WIDTH,Consts.HEIGHT);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        cw.requestFocusInWindow();
    }
    public static void main(String[] args) {
        new Pong();
    }

}
class ControlWindow extends JPanel implements ActionListener, KeyListener{
    private Ball ball = new Ball(Consts.WIDTH/2,Consts.HEIGHT/2,30,5,5);
    private Timer timer = new Timer(10,this);
    private Player lp = new Player(0,Consts.HEIGHT/2-100);
    private Player rp = new Player(Consts.WIDTH-20-30,Consts.HEIGHT/2-100);
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
         
        //tao bong
        g.setColor(Color.WHITE);
        g.fillOval(ball.x,ball.y, ball.diameter, ball.diameter);

        //tao nguoi choi 1
        g.setColor(Color.RED);
        g.fillRect(lp.x, lp.y, lp.width, lp.height);

        //tao nguoi choi 2
        g.setColor(Color.BLUE);
        g.fillRect(rp.x, rp.y, rp.width,rp.height);

        g.setColor(Color.YELLOW);
        g.setFont(new Font("Consolas",Font.BOLD,30));
        g.drawString("LEFT: "+lp.score,0,40);
        g.drawString("RIGHT: "+rp.score,Consts.WIDTH-200,40);

    }
    @Override public void actionPerformed(ActionEvent e){
        // bong di chuyen
        ball.x += ball.speedX;
        ball.y += ball.speedY;
        Rectangle rectBall = new Rectangle(ball.x,ball.y,ball.diameter,ball.diameter);
        Rectangle rectlp = new Rectangle(lp.x, lp.y, lp.width, lp.height);
        Rectangle rectrp = new Rectangle(rp.x, rp.y, rp.width,rp.height);
        if(rectBall.intersects(rectrp)){
            ball.speedX = -Math.abs(ball.speedX);
            ball.x = rp.x - ball.diameter; 
        }
        if(rectBall.intersects(rectlp)){
            ball.speedX = Math.abs(ball.speedX);
            ball.x = lp.x + lp.width;
            
        }
        if(ball.y>=Consts.HEIGHT-ball.diameter || ball.y<=0+ball.diameter){
            ball.speedY *=-1;
        }
        if(ball.x>=getWidth()-ball.diameter){
            lp.score++;
            ball.x = Consts.WIDTH/2;
            ball.y= Consts.HEIGHT/2;
        }
        if(ball.x<=0){
            rp.score++;
            ball.x = Consts.WIDTH/2;
            ball.y= Consts.HEIGHT/2;
        }
        

        repaint();
    }
    public ControlWindow(){
        System.out.println("A");
        timer.start();
        this.setBackground(Color.LIGHT_GRAY);
        this.addKeyListener(this);
        this.setFocusable(true);
         
    }
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode()  == KeyEvent.VK_W)
            lp.y-=lp.speedY;
        else if(e.getKeyCode()  == KeyEvent.VK_S){
            lp.y+=lp.speedY;
            if (lp.y > getHeight() - lp.height) lp.y = getHeight() - lp.height;
        
        }
        if(e.getKeyCode()  == KeyEvent.VK_UP)
            rp.y-=rp.speedY;
        else if(e.getKeyCode()  == KeyEvent.VK_DOWN){
            rp.y+=rp.speedY;
            if (rp.y > getHeight() - rp.height) rp.y = getHeight() - rp.height;
        }
        if(e.getKeyCode()  == KeyEvent.VK_R){
            lp.score=0;
            rp.score=0;
            ball.x = Consts.WIDTH/2;
            ball.y= Consts.HEIGHT/2;
        }
            
        
    }
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

}
class Ball{
    public int x,y,diameter;
    public int speedX = 5,speedY  = 5;
    public Ball(){}
    public Ball(int x, int y, int diameter,int speedX, int speedY){
        this.x=x;
        this.y=y;
        this.diameter=diameter;
        this.speedX=speedX;
        this.speedY=speedY;
    }
}
class Player{
    public int x,y;
    public int width = 30, height = 100;
    public int speedY = 13;
    public int score = 0;
    public Player(int x, int y){
        this.x=x;
        this.y=y;
    
    }
  
}
class Consts{
    public static final int WIDTH = 1000;
    public static final int HEIGHT  = 550; 
}
