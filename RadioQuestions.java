import java.awt.*;
import java.awt.event.*;
public class RadioQuestions extends Frame implements ItemListener{
Checkbox q1,q11,q2,q22,q3,q33;
CheckboxGroup g1,g2,g3;
String msg="";
public RadioQuestions(){
g1=new CheckboxGroup();
g2=new CheckboxGroup();
g3=new CheckboxGroup();
q1= new Checkbox("true",g1,false);
q11= new Checkbox("false",g1,false);
q2= new Checkbox("true",g2,false);
q22= new Checkbox("false",g2,false);
q3= new Checkbox("true",g3,false);
q33= new Checkbox("false",g3,false);
add(q1);
q1.setBounds(10,50,100,20);
add(q11);
q11.setBounds(130,50,100,20);
add(q2);
q2.setBounds(10,100,100,20);
add(q22);
q22.setBounds(130,100,100,20);
add(q3);
q3.setBounds(10,150,100,20);
add(q33);
q33.setBounds(130,150,100,20);

Label l1=new Label("Q1. Color of tree is blue.");
l1.setBounds(10,30,200,20);
add(l1);

Label l2=new Label("Q2. Color of sky is blue.");
l2.setBounds(10,80,200,20);
add(l2);

Label l3=new Label("Q3. Implement keyword is used to inherit parent class.");
l3.setBounds(10,130,300,20);
add(l3);

q1.addItemListener(this);
q11.addItemListener(this);
q2.addItemListener(this);
q22.addItemListener(this);
q3.addItemListener(this);
q33.addItemListener(this);
addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent we){
System.exit(0);}});
this.setLayout(null);
}

public void itemStateChanged(ItemEvent ie) {
repaint();
}
public void paint(Graphics g) {
g.drawString("Question 1: ", 10, 200);
g.drawString("Question 2: ", 10, 220);
g.drawString("Question 3: ", 10, 240);

if(g1.getSelectedCheckbox().getLabel()=="false"){
g.setColor(Color.green);
g.drawString("Correct", 100, 200);
}
else{
g.setColor(Color.red);
g.drawString("Wrong", 100, 200);
}

if(g2.getSelectedCheckbox().getLabel()=="true"){
g.setColor(Color.green);
g.drawString("Correct", 100, 220);
}
else{
g.setColor(Color.red);
g.drawString("Wrong", 100, 220);
}

if(g3.getSelectedCheckbox().getLabel()=="false"){
g.setColor(Color.green);
g.drawString("Correct", 100, 240);
}
else{
g.setColor(Color.red);
g.drawString("Wrong", 100, 240);
}
}
public static void main(String args[]){
RadioQuestions q=new RadioQuestions();
q.setSize(400,300);
q.setVisible(true);
}
}
