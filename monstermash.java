import java.util.*;
import java.io.*;
public class monstermash {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("monstermash.in"));
        int n = Integer.parseInt(f.readLine());
        int a = Integer.parseInt(f.readLine());
        int b = Integer.parseInt(f.readLine());
        for (int i = 1; i <= n; i++) {
            if(i % a == 0 && i % b == 0) {
                System.out.println("It was a graveyard smash!");
            } else if(i % a == 0) {
                System.out.println("He did the Monster Mash!");
            } else if(i % b == 0) {
                System.out.println("He did the flash,");
            } else {
                System.out.println("He did the mash,");
            }
        }
    }
}
