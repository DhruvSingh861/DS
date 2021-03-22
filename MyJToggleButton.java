import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyJToggleButton extends JFrame{
Container c;
JToggleButton b,b2;
Label l;
MyJToggleButton(){
c=getContentPane();
c.setLayout(null);
l=new Label();
l.setBounds(100,100,100,50);
b=new JToggleButton("ON/OFF");
b.setBounds(100,50,100,50);
b.addItemListener(new ItemListener(){
public void itemStateChanged(ItemEvent ie){
if(b.isSelected())
{l.setText("Button is ON");
b.setText("ON");
}else
{l.setText("Button is OFF");
b.setText("OFF");
}
}}); 
c.add(b);
c.add(l);
setSize(400,400);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);}
public static void main(String args[]){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new MyJToggleButton();
}});
}
}