import  java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {

    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

    double  x=100;	//小球的横坐标
    double  y=100; //小球的纵坐标
    boolean right = true;//方向
    //画窗口的方法
    public void paint(Graphics  g){
        System.out.println("窗口被画了一次！");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int)x, (int)y, null);

        if (right){
            x = x+10;
        }else {
            x = x-10;
        }

        if (x>856-40-30){
            right = false;
        }
        if (x<40){
            right = true;
        }

    }

    //窗口加载
    void launchFrame() throws InterruptedException {
        setSize(856,500);
        setLocation(50,50);
        setVisible(true);
        //重画窗口

        while (true){
            repaint();
            Thread.sleep(40);//40毫秒，1秒=1000毫秒，大约一秒画20次窗口
        }
    }

    //main方法是程序执行的入口
    public static void main(String[] args) throws InterruptedException {
        System.out.println("好玩吗，这个小游戏？");
        BallGame game = new BallGame();
        game.launchFrame();
    }

}
