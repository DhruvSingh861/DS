import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyJTabbedPane extends JFrame{
MyJTabbedPane(){
JPanel p1=new JPanel();
p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
JPanel p2=new JPanel();
p2.setLayout(new BoxLayout(p2,BoxLayout.X_AXIS));
JButton b1=new JButton("INDIA");
p1.add(b1);
JButton b11=new JButton("FRANCE");
p1.add(b11);
JButton b2=new JButton("RED");
p2.add(b2);
JButton b22=new JButton("BLUE");
p2.add(b22);
JTabbedPane tp=new JTabbedPane();
tp.addTab("Country",p1);
tp.addTab("Color",p2);
add(tp);
setSize(440,300);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[]){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new MyJTabbedPane();
}});
}
}