import java.awt.*;
import java.awt.event.*;
public class FruitChoice extends Frame{
Choice c;
TextField t1;
Button ri,rn;
String msg="";
public FruitChoice(){
t1=new TextField("Enter Index of Item");
t1.setBounds(20,110,130,20);
c=new Choice();
c.setBounds(20,50,100,50);
ri=new Button("Remove by Index");
ri.setBounds(150,110,130,20);
rn=new Button("Remove selected Item from Choice");
rn.setBounds(20,150,200,20);
c.add("Mango");
c.add("Apple");
c.add("Banana");
c.add("Pineapple");
c.add("Grapes");

ri.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
c.remove(Integer.parseInt(t1.getText()));
repaint();
}});

rn.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
String s=c.getSelectedItem();
c.remove(s);
repaint();
}});

t1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){
msg=c.getItem(Integer.parseInt(t1.getText()));
repaint();
}});

addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);
}});
add(c);
add(t1);
add(ri);
add(rn);
setLayout(null);
}
public void paint(Graphics g){
int s=c.getItemCount();
g.drawString("Number of Items in Choice: "+s,20,250);
g.drawString(msg,280,125);
}

public static void main(String args[]){
FruitChoice fc=new FruitChoice();
fc.setSize(400,300);
fc.setVisible(true);

}



}