import java.net.*;
import java.io.*;
public class Server{
public static void main(String args[]) throws Exception{
try{
DatagramSocket ds=new DatagramSocket();
System.out.println(ds.getLocalPort());
byte[] buffer=new byte[1024];
DatagramPacket dp=new DatagramPacket(buffer,1024);
ds.receive(dp);
String str=new String(dp.getData(), 0,dp.getLength());
System.out.println(str);
ds.close();
}
catch(Exception e){
System.out.println(e);}
}
}