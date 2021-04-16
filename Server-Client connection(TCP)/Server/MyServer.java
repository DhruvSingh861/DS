import java.io.*;
import java.net.*;
public class MyServer{
public static void main(String args[]) throws Exception{
try{
ServerSocket ss=new ServerSocket(8081);
Socket s=ss.accept();
System.out.println(s.getPort());
System.out.println(s.getLocalPort());
DataInputStream dis=new DataInputStream(s.getInputStream());
String str=(String)dis.readUTF();
System.out.println("MESSSAGE= "+str);
ss.close();
}
catch(Exception e){
System.out.println(e);
}
}
}