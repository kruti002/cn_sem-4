import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args)throws IOException{
        System.out.println("Ip Address Matching");
        System.out.println("Enter the IP Address : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] index = input.split("\\.");
        int check = Integer.parseInt(index[0]);
        String mask=null;
        if(check>= 0 && check<256){
            if(check < 128){
                System.out.println("The IP Address Is of Class A");
                mask = "255.0.0.0";
                System.out.println("Subnet Mask : "+mask);
            }
            else if(check <192){
                System.out.println("The IP Address Is of Class B");
                mask = "255.255.0.0";
                System.out.println("Subnet Mask : "+mask);
            }
            else if(check < 224){
                System.out.println("The IP Address Is of Class C");
                mask = "255.255.255.0";
                System.out.println("Subnet Mask : "+mask);
            }
            else if(check < 240){
                System.out.println("The IP Address Is of Class D");
            }
            else if(check < 256){
                System.out.println("The IP Address Is of Class E");
            }
        }
        else{
            System.out.println("Enter a valid IP address");
        }
        String NetworkAddress="";
        String[] masking = mask.split("\\.");
        for(int i=0;i<4;i++){
            int x = Integer.parseInt(index[i]);
            int y = Integer.parseInt(masking[i]);
            int z = x & y;
            NetworkAddress = NetworkAddress + z + '.';
            
        }
        System.out.println(NetworkAddress);
    }
}
