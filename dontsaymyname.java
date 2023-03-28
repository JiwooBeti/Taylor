import java.util.*;
import java.io.*;
public class dontsaymyname {
    public static void main(String[] args) throws Exception {
        //Scanner sc = new Scanner(new FileReader("dontsaymyname.in"));
        BufferedReader f = new BufferedReader(new FileReader("dontsaymyname.in"));
       // sc.next();
        //int cnt = 0;
        int n = Integer.parseInt(f.readLine());

        for (int j = 0; j < n; j++) {
            int cnt = 0;
            String s = f.readLine();
            String[] ar = s.split(" ");
            for (int i = 0; i < ar.length; i++) {
                if(ar[i].contains("Bob")) {
                    cnt++;
                }
            }

            
            System.out.println(cnt==3?"Boo!" : "Hiding");
        }
        /*while(sc.hasNextLine()) {
            sc.nextLine();
            String s = sc.nextLine();
            System.out.println(s);
            if(s.charAt(0) == '-') {
                if(cnt != -1) {
                    System.out.println(cnt);
                }
                cnt = 0;
            }
            String[] ar = s.split(" ");
            for (int i = 0; i < ar.length; i++) {
                if(ar[i].contains("Bob")) {
                    cnt++;
                }
            }
            //System.out.println(cnt);
        }*/
    }
}
