import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

class MyPanel extends JPanel{
Insets ins;
Random rand;
//--------------------3--------------------------------------------------------
MyPanel(){
setBorder(BorderFactory.createLineBorder(Color.RED,10));
rand=new Random();
}
protected void paintComponent(Graphics g){
super.paintComponent(g);
int x,y,x2,y2;
int height = getHeight();
int width = getWidth();
ins = getInsets();
for(int i=0; i < 10; i++) {
x = rand.nextInt(width-ins.left);
y = rand.nextInt(height-ins.bottom);
x2 = rand.nextInt(width-ins.left);
y2 = rand.nextInt(height-ins.bottom);
g.drawLine(x, y, x2, y2);
}
}
}

class PaintDemo{
MyPanel p;
//-------------2----------------------------------------------------------------
PaintDemo(){
JFrame f=new JFrame("Swing Paint Demo");
f.setSize(550,500);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
p=new MyPanel();
f.add(p);
f.setVisible(true);
} 
//-------------1-----------------------------------------------------------------
public static void main(String args[]){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new PaintDemo();
}});
}
}