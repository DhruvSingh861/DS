import java.awt.*;  
import java.awt.event.*;  
public class ButtonExample {  
public static void main(String[] args) {  
Frame f=new Frame("Button Example");  
f.addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);}});
TextField tf=new TextField();  
tf.setBounds(50,50, 150,20);  
Button b=new Button("Click Here");  
b.setBounds(50,100,60,30);  
    
b.addActionListener(new ActionListener(){  
public void actionPerformed(ActionEvent e){  
tf.setText("Welcome SIR");
f.setBackground(Color.GREEN);  
Frame f2=new Frame();
f2.setSize(250,200);
Button b1=new Button("CLOSE");
b1.setBounds(50,100,60,30);
b1.setBackground(Color.RED);

b1.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent e){
f2.setVisible(false);
}});
f2.add(b1);
f2.setVisible(true);
}});  


f.add(b);f.add(tf);  
f.setSize(400,400);  
f.setLayout(null);  
f.setVisible(true);   
}  
}  