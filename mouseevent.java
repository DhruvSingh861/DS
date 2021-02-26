import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*
<applet code="mouseevent" width=300 height=100>
</applet>

*/
public class mouseevent extends Applet implements MouseListener, MouseMotionListener {
int mx=0,my=0;
String msg;

public void init(){
addMouseListener(this);
addMouseMotionListener(this);
}

public void mouseClicked(MouseEvent me){
mx=0;
my=10;
msg="mouse clicked";
repaint();
}

public void mouseEntered(MouseEvent me){
mx=0;
my=10;
msg="mouse entered";
repaint();
}

public void mouseExited(MouseEvent me){
mx=0;
my=10;
msg="mouse exited";
repaint();
}

public void mousePressed(MouseEvent me){
mx=me.getX();
my=me.getY();
msg="Down";
repaint();
}

public void mouseReleased(MouseEvent me){
mx=me.getX();
my=me.getY();
msg="Up";
repaint();
}

public void mouseDragged(MouseEvent me){
mx=me.getX();
my=me.getY();
msg="*";
showStatus("Dragging mouse at " + mx + ", " + my);
repaint();
}

public void mouseMoved(MouseEvent me){
mx=me.getX();
my=me.getY();
showStatus("Moving mouse at " + mx + ", " + my);
repaint();
}
public void paint(Graphics g){
g.drawString(msg,mx,my);
}


}