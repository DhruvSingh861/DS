import java.net.*;
import java.io.*;
public class Client{
public static void main(String args[]) throws Exception{
try{
DatagramSocket ds=new DatagramSocket(1001);
String str="HELLO SERVER -from client";
InetAddress ip=InetAddress.getByName("127.0.0.1");
DatagramPacket dp=new DatagramPacket(str.getBytes(),str.length(),ip,50327);
ds.send(dp);
ds.close();
}
catch(Exception e){
System.out.println(e);}
}
}