import java.net.*;
import java.io.*;
public class Server1{
public static void main(String args[]) throws Exception{
ServerSocket ss=new ServerSocket(3333,2,InetAddress.getByName("192.168.1.1"));
Socket s=ss.accept();
DataInputStream dis=new DataInputStream(s.getInputStream());
String str1="";

//----------write---------------------------------
DataOutputStream dos=new DataOutputStream(s.getOutputStream());
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
String str2="";
//----------write---------------------------------

while(!str1.equals("stop")){
str1=dis.readUTF();
System.out.println("Client==="+str1);

//----------write---------------------------------
str2=br.readLine();
dos.writeUTF(str2);
dos.flush();
//----------write--------------------------------

}
dis.close();
s.close();
ss.close();
}
}