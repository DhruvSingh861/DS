import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyJLabel extends JFrame{
MyJLabel(){
JFrame f=new JFrame("JLabel example");
f.setSize(1200,700);
ImageIcon ii=new ImageIcon("tiger.jpg");
JLabel l=new JLabel("LION",ii,JLabel.CENTER);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.getContentPane().setBackground(Color.YELLOW);
f.add(l);
f.setVisible(true);
}
public static void main(String args[]){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new MyJLabel();
}});
}
}