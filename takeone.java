import java.util.*;
import java.io.*;
public class takeone {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("takeone.in"));
        int n = Integer.parseInt(f.readLine());
       // System.out.println(n);
        int candy = Integer.parseInt(f.readLine());
        for (int i = 0; i < n; i++) {
            candy-= Integer.parseInt(f.readLine());
            //System.out.println(candy);
        }
        if(candy <= 0) {
            System.out.println("no more candy");
            return;
        }
        System.out.println(candy);
        
    }
}
