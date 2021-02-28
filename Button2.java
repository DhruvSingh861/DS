import java.awt.*;
import java.awt.event.*;

public class Button2 extends Frame implements ActionListener{
Button yes,no;
String msg="";
public Button2(){
yes=new Button("YES");
no=new Button("NO");
yes.setBounds(10,50,60,40);
no.setBounds(80,50,60,40);
yes.setBackground(Color.RED);
no.setBackground(Color.GREEN);
add(yes);
add(no);
yes.addActionListener(this);
no.addActionListener(this);
this.setLayout(null);
}
public void actionPerformed(ActionEvent ae){
String str=ae.getActionCommand();
if(str.equals("YES")) 
msg = "You pressed Yes.";
else if(str.equals("NO"))
msg = "You pressed No.";
repaint();
}
public void paint(Graphics g){
Font f=new Font("Dialog",Font.BOLD,20);
g.setColor(Color.BLUE);
g.setFont(f);
g.drawString(msg,10,150);
}


public static void main(String args[]){
Button2 b2=new Button2();
b2.setSize(400,300);
b2.setVisible(true);
b2.setLayout(null);
b2.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);}});
}
}