import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyJCheckBox extends JFrame implements ItemListener{
JCheckBox r;
JPanel c;
JLabel l;
MyJCheckBox(){
c=new JPanel();
c.setLayout(new BoxLayout(c,BoxLayout.Y_AXIS));
r=new JCheckBox("java");
r.addItemListener(this);
c.add(r); 
r=new JCheckBox("C++");
r.addItemListener(this);
c.add(r); 
r=new JCheckBox("C");
r.addItemListener(this);
c.add(r); 
l = new JLabel("Select languages");
c.add(l);
add(c);
setSize(400,400);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void itemStateChanged(ItemEvent ie){
JCheckBox r = (JCheckBox)ie.getItem();
if(r.isSelected())
l.setText(r.getText()+" is selected");
else
l.setText(r.getText()+" is cleared");
}
public static void main(String args[]){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new MyJCheckBox();
}});
}
}