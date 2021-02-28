import java.awt.*;
import java.awt.event.*;
public class CheckBoxDemo extends Frame implements ItemListener{
Checkbox winXP, winVista, solaris, mac;
String msg="";
public CheckBoxDemo(){
winXP = new Checkbox("Windows XP", null, true);
winVista = new Checkbox("Windows Vista");
solaris = new Checkbox("Solaris");
mac = new Checkbox("Mac OS");
add(winXP);
winXP.setBounds(10,50,100,20);
winVista.setBounds(10,70,100,20);
solaris.setBounds(130,50,100,20);
mac.setBounds(130,70,100,20);
add(winVista);
add(solaris);
add(mac);
winXP.addItemListener(this);
winVista.addItemListener(this);
solaris.addItemListener(this);
mac.addItemListener(this);
this.setLayout(null);
}
public void itemStateChanged(ItemEvent ie) {
repaint();
}
public void paint(Graphics g) {
msg = "Current state: ";
g.drawString(msg, 6, 140);
msg = " Windows XP: " + winXP.getState();
g.drawString(msg, 6, 160);
msg = " Windows Vista: " + winVista.getState();
g.drawString(msg, 6, 180);
msg = " Solaris: " + solaris.getState();
g.drawString(msg, 6, 200);
msg = " Mac OS: " + mac.getState();
g.drawString(msg, 6, 220);
}
public static void main(String args[]){
CheckBoxDemo c=new CheckBoxDemo();
c.setSize(400,300);
c.setVisible(true);
c.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);}});
}
}