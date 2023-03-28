import java.util.*;
import java.io.*;
public class candyquota {
    public static void main(String[] args) throws Exception {
        //BufferedReader f = new BufferedReader(new FileReader("candyquota.in"));
        Scanner sc = new Scanner(new FileReader("candyquota.in"));
        
        while(sc.hasNextLine()) {
            int skittle = sc.nextInt()*11;
            int snicker = sc.nextInt()*20;
            int reese = sc.nextInt()*8;
            int sum = skittle + snicker + reese - 600;
            System.out.println((sum<=0) ? "True" : "False");
        }


    }
}
