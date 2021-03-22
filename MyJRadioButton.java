import java.awt.*;
import java.awt.event.*;
import javax.swing.*; 
class MyJRadioButton extends JFrame implements ActionListener{
JRadioButton r1,r2,r3;
JLabel l;
Container c;
MyJRadioButton(){
setLayout(new FlowLayout());
c=getContentPane();
l=new JLabel("Here");
r1=new JRadioButton("A");
r2=new JRadioButton("B");
r3=new JRadioButton("C");
r1.addActionListener(this);
r2.addActionListener(this);
r3.addActionListener(this);
c.add(r1);
c.add(r3);
c.add(r2);
c.add(l);
ButtonGroup bg=new ButtonGroup();
bg.add(r1);
bg.add(r3);
bg.add(r2);
setSize(440,300);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent ae) {
l.setText("You selected " + ae.getActionCommand());
}
public static void main(String args[]){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new MyJRadioButton();
}});
}
}