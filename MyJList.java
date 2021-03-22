import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
class MyJList extends JFrame{
JScrollPane sp;
JLabel lab;
JList l;
String Cities[] = { "New York", "Chicago", "Houston",
"Denver", "Los Angeles", "Seattle",
"London", "Paris", "New Delhi",
"Hong Kong", "Tokyo", "Sydney" };

MyJList(){
setLayout(new FlowLayout());
l=new JList(Cities);
l.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
sp=new JScrollPane(l);
sp.setPreferredSize(new Dimension(120,90));
lab=new JLabel("SELECT CITY");
l.addListSelectionListener(new ListSelectionListener(){
public void valueChanged(ListSelectionEvent le){
int index=l.getSelectedIndex();
lab.setText("city Selected: "+Cities[index]);
}});
add(sp);
add(lab);
setSize(440,300);
setVisible(true);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public static void main(String args[]){
SwingUtilities.invokeLater(new Runnable(){
public void run(){
new MyJList();
}});
}
}