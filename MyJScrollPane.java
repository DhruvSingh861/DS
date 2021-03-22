import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyJScrollPane extends JFrame{
MyJScrollPane(){
JPanel p = new JPanel();
p.setLayout(new GridLayout(20, 20));
int b = 0;
for(int i = 0; i < 20; i++) {
for(int j = 0; j < 20; j++) {
p.add(new JButton("Button " + b));
++b;
}
}
JScrollPane sp = new JScrollPane(p);
add(sp,BorderLayout.CENTER);
setSize(440,300);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[]){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new MyJScrollPane();
}});
}
}