import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class SampleFont extends Frame{
int next=0;
String msg;
Font f;
public SampleFont(){
f=new Font("Dialog",Font.PLAIN,15);
msg="DIALOG";
setFont(f);
addMouseListener(new MouseAdapter(){
public void mousePressed(MouseEvent me){
next++;
switch(next) {
case 0:
f = new Font("Dialog", Font.PLAIN, 15);
msg = "Dialog";
break;
case 1:
f = new Font("DialogInput", Font.PLAIN, 55);
msg = "DialogInput";
break;
case 2:
f = new Font("SansSerif", Font.PLAIN, 55);
msg = "SansSerif";
break;
case 3:
f = new Font("Serif", Font.PLAIN, 55);
msg = "Serift";
break;
case 4:
f = new Font("Monospaced", Font.PLAIN, 55);
msg = "Monospaced";
break;
}
if(next == 4) next = -1;
setFont(f);
repaint();
}});



addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);
}});


}



public void paint(Graphics g){
g.drawString(msg,10,130);
}


public static void main(String args[]){
SampleFont SF=new SampleFont();
SF.setSize(800,300);
SF.setVisible(true);
}
}
