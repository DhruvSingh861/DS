import java.awt.*;
import java.awt.event.*;
public class MyLogin extends Frame {
TextField name,pass,con;
Label l1,l2,l3;
String msg="";
public MyLogin(){
l1=new Label("name: ");
l2=new Label("Password: ");
l3=new Label("Confirm: ");
l3.setBounds(20,110,60,20);
l1.setBounds(20,50,60,20);
l2.setBounds(20,80,60,20);
name=new TextField(20);
name.setBounds(90,50,80,20);
pass=new TextField(20);
pass.setBounds(90,80,80,20);
pass.setEchoChar('*');
con=new TextField(20);
con.setBounds(90,110,80,20);
add(name);
add(pass);
add(l1);
add(l2);
add(l3);
add(con);
setLayout(null);
name.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
repaint();
}});
pass.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
repaint();
}});
con.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
repaint();
}});
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);}});
}

public void paint(Graphics g){
g.drawString("Name: "+name.getText(),20,200);
g.drawString("Password: "+pass.getText(),20,230);
g.drawString("Confirm: "+con.getText(),20,260);
String s=pass.getText();
String c=con.getText();
if(s.equals(c))
msg="";
else
msg="*Confirm Password Correctly";
g.setColor(Color.red);
g.drawString(msg,20,160);

}
public static void main(String args[]){
MyLogin tf=new MyLogin();
tf.setSize(300,300);
tf.setVisible(true);
}
}