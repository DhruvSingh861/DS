import java.io.*;
import java.net.*;
public class MyClient{
public static void main(String args[]){
try{
Socket s=new Socket("localhost",8081);
System.out.println(s.getPort());
System.out.println(s.getLocalPort());
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
String str="Hello SERVER";
dos.writeUTF(str);
dos.flush();
dos.close();
}
catch(Exception e){
System.out.println(e);
}
}
}