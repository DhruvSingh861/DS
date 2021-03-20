import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Draw extends JPanel{
JButton b,b2;
String msg="";
Draw(){
setBackground(Color.BLACK);
ImageIcon ii=new ImageIcon("mario.PNG");
b=new JButton(ii);
b.setActionCommand("MARIO is pressed");
b.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
msg=b.getActionCommand();
repaint();
}});
ImageIcon ii2=new ImageIcon("avatar.jpg");
b2=new JButton(ii2);
b2.setActionCommand("AVATAR is pressed");
b2.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
msg=b2.getActionCommand();
repaint();
}});
b.setBackground(Color.YELLOW);
b2.setBackground(Color.YELLOW);
add(b);
add(b2);
}
protected void paintComponent(Graphics g){
super.paintComponent(g);
Font f=new Font("Dialog",Font.BOLD,20);
g.setColor(Color.RED);
setFont(f);
g.drawString(msg,170,450);
} 
}


class MyJButton {
Draw p;
JFrame f;
MyJButton(){
p=new Draw();
f=new JFrame("JButton in swing");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(500,600);
f.setVisible(true);
f.add(p);
}
public static void main(String args[]){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new MyJButton();
}});
}
}