import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Draw extends JPanel{
JTextField t;
String msg="fffffffffffffff";
Draw(){
t=new JTextField("write hereeeeeeeeeeeeeeeeeeeee");
t.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
msg=t.getText();
repaint();
}});
add(t);
}
protected void paintComponent(Graphics g){
super.paintComponent(g);
g.drawString(msg,100,300);
}
}
class MyTextField{
Draw p;
MyTextField(){
p=new Draw();
JFrame f=new JFrame();
f.setSize(600,400);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.add(p);
f.setVisible(true);
}


public static void main(String args[]){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new MyTextField();
}});
}
}


