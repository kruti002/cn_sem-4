
import java.util.*;

public class Main{
 public static void main(String[] args) {
 Scanner sc =new Scanner(System.in);
 System.out.println("Enter IP Address: ");
 String ip =sc.next();
 String checkclass = ip.substring(0,3);
 int cc = Integer.parseInt(checkclass);
 String mask = null;
 if(cc>0 && cc<224){
 if(cc<=127){
 System.out.println("IP Address is of Class A");
 mask="255.0.0.0";
 }
 if(cc>=128 && cc<=191){
 System.out.println("IP Address is of Class B");
 mask="255.255.0.0";
 }
 if(cc>=192 && cc<=223){
 System.out.println("IP Address is of Class C");
 mask="255.255.255.0";
 }
 if(cc>=224){
 System.out.println("IP Address is used for Multicasting or reserved");
 }
 }
 System.out.println("Subnet Mask:\n"+mask);
 String networkAddr="";
 String[] ipAddrParts = ip.split("\\.");
 String[] maskParts = mask.split("\\.");
 for(int i=0;i<=3;i++){
 int x = Integer.parseInt(ipAddrParts[i]);
 int y = Integer.parseInt(maskParts[i]);
 int z = x & y;
 
 networkAddr += z+".";
 }
 System.out.println("SUBNET Address:\n"+networkAddr);
 }
}