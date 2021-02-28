import java.awt.*;
import java.awt.event.*;

public class Button3 extends Frame implements ActionListener{
Button h,e,he,notany;
String msg="";
public Button3(){
h=new Button("HINDI");
e=new Button("ENGLISH");
he=new Button("HINDI+ENGLISH");
notany=new Button("NOT ANY");
h.setBounds(10,50,60,40);
e.setBounds(80,50,60,40);
he.setBounds(150,50,120,40);
notany.setBounds(280,50,60,40);
add(h);
add(e);
add(he);
add(notany);
e.addActionListener(this);
h.addActionListener(this);
he.addActionListener(this);
notany.addActionListener(this);
this.setLayout(null);
}
public void actionPerformed(ActionEvent ae){
String str=ae.getActionCommand();
msg = "We do not khow the language: "+str;
repaint();
}
public void paint(Graphics g){
Font f=new Font("Dialog",Font.BOLD,20);
g.setColor(Color.BLUE);
g.setFont(f);
g.drawString(msg,10,150);
}


public static void main(String args[]){
Button3 b2=new Button3();
b2.setSize(500,200);
b2.setVisible(true);
b2.setLayout(null);
b2.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);}});
}
}