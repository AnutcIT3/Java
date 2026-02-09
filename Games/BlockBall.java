// package Games;

// import javax.swing.JFrame;
// import javax.swing.JPanel;

// import java.awt.Graphics;
// import java.awt.event.*;
// import javax.swing.event.AncestorListener;

// public class BlockBall extends JFrame {

//     public BlockBall(){
//         this.pack();
//         this.setTitle("BlockBall");
//         this.setSize(Consts.WIDTH, Consts.HEIGHT);
//         this.setLocationRelativeTo(null);
//         this.setResizable(false);
//         this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//         this.setVisible(true);
//     }
//     public static void main(String[] args) {
//         new BlockBall();
//     }
// }
// class ControlWindow extends JPanel implements ActionListener, KeyListener{
//     @Override
//     public void paintComponent(Graphics g){
//         super.paintComponent(g);


//     }

//     @Override
//     public void keyPressed(KeyEvent arg0) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
//     }

//     @Override
//     public void keyReleased(KeyEvent arg0) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'keyReleased'");
//     }

//     @Override
//     public void keyTyped(KeyEvent arg0) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
//     }

//     @Override
//     public void actionPerformed(ActionEvent arg0) {
//         // TODO Auto-generated method stub
//         throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
//     }
    
// }
// class Ball{
//     public int x,y,diameter;
//     public int speedX = 5,speedY  = 5;
//     public Ball(){}
//     public Ball(int x, int y, int diameter,int speedX, int speedY){
//         this.x=x;
//         this.y=y;
//         this.diameter=diameter;
//         this.speedX=speedX;
//         this.speedY=speedY;
//     }
// }
// class Player{
//     public int x,y;
//     public int width = 200, height = 30;
//     public int speedY = 13;
//     public int score = 0;
//     public Player(int x, int y){
//         this.x=x;
//         this.y=y;
    
//     }
// }
// class Consts{
//     public static final int WIDTH = 1000;
//     public static final int HEIGHT  = 550; 
// }