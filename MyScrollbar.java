import java.awt.*;
import java.awt.event.*;
public class MyScrollbar extends Frame{
Scrollbar sv,sh;
int x,y;
MyScrollbar(){
sv=new Scrollbar(Scrollbar.VERTICAL,0,1,0,340);
sv.setBounds(10,30,20,340);
sh=new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,380);
sh.setBounds(10,370,380,20);

addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);}});

sv.addAdjustmentListener(new AdjustmentListener(){
public void adjustmentValueChanged(AdjustmentEvent ae) {
repaint();
}});
sh.addAdjustmentListener(new AdjustmentListener(){
public void adjustmentValueChanged(AdjustmentEvent ae) {
repaint();
}});

addMouseMotionListener(new MouseMotionAdapter(){
public void mouseDragged(MouseEvent me){
x = me.getX();
y = me.getY();
sh.setValue(x);
sv.setValue(y);
repaint();
}});

add(sv);
add(sh);
this.setLayout(null);
}

public void paint(Graphics g) {
g.drawString("*",sh.getValue(),sv.getValue());
g.drawLine(30,sv.getValue(),x,y);
g.drawLine(sh.getValue(),370,x,y);
}

public static  void main(String args[]){
MyScrollbar sb=new MyScrollbar();
sb.setSize(400,400);
sb.setVisible(true);

}
}