//TCP.JAVA 
//TCP-SERVER 
import java.io.*;
import java.net.*;

class ServerTCP {
    public static void main(String[] args) throws Exception {
        String msg;
        ServerSocket ss = new ServerSocket(80);
        while (true) {
            Socket s1 = ss.accept();
            String week[] = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
            int i = (int) (Math.random() * week.length);
            msg = week[i];
            PrintStream ps = new PrintStream(s1.getOutputStream());
            ps.println(msg);
        }
    }
}


//TCP-CLIENT 
import java.io.*;
import java.net.*;

class ClientTCP {
    public static void main(String[] args) throws Exception {
        Socket cs = new Socket("localhost", 80);
        BufferedReader br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
        String m = br.readLine();

        System.out.println("Message from server = " +m);
        cs.close();
    }
}
