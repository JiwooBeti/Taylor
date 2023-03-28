import java.util.*;
import java.io.*;
public class fomogus {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("fomogus.in"));
        int n = Integer.parseInt(f.readLine());
        String start = "";
        int startTime = -1;

        int gmtTime = 0;

        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(f.readLine());
            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());

            map.put(name, score);

            if(i == 0) {
                start = name;
                startTime = score;
            }
            if(name.equals("GMT")) {
                gmtTime = 24 - startTime;
            }
        }

        int m = Integer.parseInt(f.readLine());
        for (int i = 0; i < m; i++) {
            String name = f.readLine();
           // System.out.println(map.get(name));
            System.out.println((gmtTime + map.get(name))%24 + ":00");
        }

        //System.out.println("gmttime" + gmtTime);
        //System.out.println(n);
    }
}
