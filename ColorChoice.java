import java.awt.*;
import java.awt.event.*;
public class ColorChoice extends Frame implements ItemListener{
Choice c;
String msg="";
public ColorChoice(){
c=new Choice();
c.add("WHITE");
c.add("RED");
c.add("GREEN");
c.add("BLUE");
c.add("YELLOW");
c.add("BLACK");
c.setBounds(20,50,200,50);
add(c);
setLayout(null);
c.addItemListener(this);
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);}});
}
public void itemStateChanged(ItemEvent ie) {
repaint();
}
public void paint(Graphics g) {
Font f=new Font("dialog",Font.BOLD,20);
g.setFont(f);
g.drawString("Selected Color: ", 20, 200);
msg=c.getSelectedItem();
g.drawString(msg, 180, 200);
if(msg=="GREEN")
setBackground(Color.green);
if(msg=="WHITE")
setBackground(Color.white);
if(msg=="RED")
setBackground(Color.red);
if(msg=="BLUE")
setBackground(Color.blue);
if(msg=="YELLOW")
setBackground(Color.yellow);
if(msg=="BLACK")
setBackground(Color.black);
}

public static void main(String args[]){
ColorChoice cc=new ColorChoice();
cc.setSize(400,300);
cc.setVisible(true);
}
} 