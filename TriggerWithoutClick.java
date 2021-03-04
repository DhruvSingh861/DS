import java.awt.*;  
import java.awt.event.*;  
public class TriggerWithoutClick{  
public static void main(String args[]) {  
Frame f=new Frame("Triggering one button from another button");  

f.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);}});

TextField tf=new TextField();  
tf.setBounds(50,50, 150,20);  
Button b2=new Button("Automatic");
b2.setBounds(50,200,60,30);      
Button b1=new Button("Click Here");  
b1.setBounds(50,100,60,30);      

b2.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent ab2){  
f.setBackground(Color.red);  
tf.setText("Welcome SIR");
}});

b1.addActionListener(new ActionListener(){ 
public void actionPerformed(ActionEvent ab){  
ActionEvent ae=new ActionEvent((Object)b2,ActionEvent.ACTION_PERFORMED,"");
//Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(ae);
b2.dispatchEvent(ae);  
}});  

f.add(b1);
f.add(tf);  
f.add(b2);
f.setSize(400,400);  
f.setLayout(null);  
f.setVisible(true);   
}  
}  