import java.awt.*;
import java.awt.event.*;
import java.applet.*;
//------------------------------------------------class=MyFrame----------------------------------------------------//
public class MyFrame extends Frame{
String km="---TEST---", mm="";
int x=30,y=30;
public MyFrame(){

addWindowListener(
new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);}});

addMouseListener(
new MouseAdapter(){
public void mousePressed(MouseEvent me){
x=me.getX();
y=me.getY();
mm=x+","+y;
repaint();
}});

addKeyListener(
new KeyAdapter(){
public void keyTyped(KeyEvent ke){
km+="\n"+ke.getKeyChar();
repaint();
}});
}

public void paint(Graphics g){
g.drawString(km,10,40);
g.drawString(mm,x,y);
}
//-------------------------------------------class=main inside MyFrame----------------------------------------------//
public static void main(String args[]){
MyFrame MF=new MyFrame();
MF.setSize(300,200);
MF.setTitle("AWT based window");
MF.setVisible(true);
}
}