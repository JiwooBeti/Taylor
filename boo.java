import java.util.*;
import java.io.*;
public class boo {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("boo.in"));
        char[] ar = f.readLine().toCharArray();
        for (int i = 0; i < ar.length; i++) {
            if(ar[i] =='N') {
                System.out.println("Nobody's There");
            } else {
                System.out.println("Boo!");
            }
        }
        
        
        
    }
}
