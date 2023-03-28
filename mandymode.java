import java.util.*;
import java.io.*;
public class mandymode {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("mandymode.in"));
        int n = Integer.parseInt(f.readLine());
        for (int i = 0; i < n; i++) {
            String[] ar = f.readLine().split(", ");
            String[] its = f.readLine().split(",");


            for (int j = 0; j < ar.length; j++) {
                int vowels = 0;
                for (int j2 = 0; j2 < ar[j].length(); j2++) {
                    if(isV(ar[j].charAt(j2))) {
                        vowels++;
                    }
                }
                System.out.println("x" + its[j]);
                int x = Integer.parseInt(its[j]);
                for (int k = 0; k < x; k++) {
                    System.out.println(vowels);
    
                }
            }
        }
    }

    public static boolean isV(char c) {
        if(c == 'a' || c== 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }        
        if(c == 'A' || c== 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }
}
