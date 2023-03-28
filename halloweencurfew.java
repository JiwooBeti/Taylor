import java.util.*;
import java.io.*;
public class halloweencurfew {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("halloweencurfew.in"));
        int n = Integer.parseInt(f.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            int time = 0;
            String[] ar = st.nextToken().split(":");
            int startTime = 0;
            for (int j = 0; j < ar.length; j++) {
                if(j == 0) {
                    startTime+=60*Integer.parseInt(ar[j]);
                } else {
                    startTime+=Integer.parseInt(ar[j]);
                }
            }

            int duration = Integer.parseInt(st.nextToken());
            String name = st.nextToken();

            ar = st.nextToken().split(":");
            int endTime = 0;
            for (int j = 0; j < ar.length; j++) {
                if(j == 0) {
                    endTime+=60*Integer.parseInt(ar[j]);
                } else {
                    endTime+=Integer.parseInt(ar[j]);
                }
            }

            if(endTime < startTime) {
                endTime +=60*12;
            }
            //System.out.println(startTime + " " + duration + " " + endTime);

            if(startTime  + duration <= endTime) 
            {
                System.out.println(name + " is not in trouble");
            } else {
                System.out.println(name + " is in trouble");
            }


            
            

        }
    }
}
