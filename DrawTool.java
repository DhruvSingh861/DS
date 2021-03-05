import java.awt.*;
import java.awt.event.*;
public class DrawTool extends Frame implements MouseMotionListener, MouseListener{
int x,y,w,h;
Choice c=new Choice();
Button b1=new Button();
Button b2=new Button();
Button b3=new Button();
Button b4=new Button();
Button b5=new Button();
Button b6=new Button();
Button b7=new Button();
Button b8=new Button();
Button b9=new Button();
Button b10=new Button();
Button b11=new Button();
Button b12=new Button();
Color C;


//------------------------------------------------------------------------------------------------------
public DrawTool(){
x = y = w = h = 0;
this.addMouseMotionListener(this);
this.addMouseListener(this);
this.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);}});
b1.setBounds(30,50,20,20);
b2.setBounds(30,50,20,40);
b3.setBounds(30,50,20,60);
b4.setBounds(30,50,20,80);
b5.setBounds(30,50,20,100);
b6.setBounds(30,50,20,120);
b7.setBounds(30,50,20,140);
b8.setBounds(30,50,20,160);
b9.setBounds(30,50,20,180);
b10.setBounds(30,50,20,200);
b11.setBounds(30,50,20,220);
b12.setBounds(30,50,20,240);
b1.setBackground(Color.red);
b2.setBackground(Color.blue);
b3.setBackground(Color.green);
b4.setBackground(Color.yellow);
b5.setBackground(Color.cyan);
b6.setBackground(Color.gray);
b7.setBackground(Color.lightGray);
b8.setBackground(Color.orange);
b9.setBackground(Color.magenta);
b10.setBackground(Color.pink);
b11.setBackground(Color.white);
b12.setBackground(Color.black);
add(b1);
add(b2);
add(b3);
add(b4);
add(b5);
add(b6);
add(b7);
add(b8);
add(b9);
add(b10);
add(b11);
add(b12);
b1.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){C=b1.getBackground();}});
b2.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){C=b2.getBackground();}});
b3.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){C=b3.getBackground();}});
b4.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){C=b4.getBackground();}});
b5.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){C=b5.getBackground();}});
b6.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){C=b6.getBackground();}});
b7.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){C=b7.getBackground();}});
b8.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){C=b8.getBackground();}});
b9.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){C=b9.getBackground();}});
b10.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){C=b10.getBackground();}});
b11.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){C=b11.getBackground();}});
b12.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent ae){C=b12.getBackground();}});
c.setBounds(200,50,80,30);
c.add("Pencil");
c.add("Rectangle");
c.add("Circle");
add(c);
setLayout(null);
}
//-----------------------------------------------------------------------------------------------------------
public void setStartPoint(int x, int y) {
this.x = x; this.y = y;
}

public void setEndPoint(int x, int y) { 
if(c.getSelectedItem().equals("Rectangle")){
w = Math.abs(this.x - x); 
h = Math.abs(this.y - y); 
}
if(c.getSelectedItem().equals("Circle")){
w = Math.abs(this.x - x); 
h = Math.abs(this.y - y); 
}
if(c.getSelectedItem().equals("Pencil")){
w=x;
h=y;
}
}

int flag=0;
public void mouseDragged(MouseEvent e){
if(c.getSelectedItem().equals("Rectangle")){
setEndPoint(e.getX(), e.getY());
//repaint();
}
if(c.getSelectedItem().equals("Circle")){
setEndPoint(e.getX(), e.getY());
//repaint();
}
if(c.getSelectedItem().equals("Pencil")){
Graphics g=getGraphics();
x=e.getX();
y=e.getY();
g.setColor(C);
g.drawLine(x,y,w,h);
w=x;h=y;
}}




public void mousePressed(MouseEvent e){
if(c.getSelectedItem().equals("Rectangle")){
setStartPoint(e.getX(), e.getY());
}
if(c.getSelectedItem().equals("Circle")){
setStartPoint(e.getX(), e.getY());
}
if(c.getSelectedItem().equals("Pencil")){
w=e.getX();
h=e.getY();
}
}


public void mouseMoved(MouseEvent me){}
public void mouseClicked(MouseEvent me){}
public void mouseEntered(MouseEvent me){}
public void mouseExited(MouseEvent me){}

public void mouseReleased(MouseEvent e) {
if(c.getSelectedItem().equals("Rectangle")){

setEndPoint(e.getX(), e.getY());
repaint();
}
if(c.getSelectedItem().equals("Circle")){
setEndPoint(e.getX(), e.getY());
repaint();
}
}


public void paint(Graphics g) {
g.setColor(C);
if(c.getSelectedItem().equals("Rectangle")){

g.drawRect(x, y, w, h);
}
if(c.getSelectedItem().equals("Circle")){
g.drawOval(x,y,w,h);
}
}

public void update(Graphics g){
paint(g);
}













public static void main(String args[]){
DrawTool d=new DrawTool();
d.setSize(400,500);
d.setVisible(true);
}
}