import java.util.*;
import java.io.*;
public class scarymovies {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("scarymovies.in"));
        int n = Integer.parseInt(f.readLine());

        TreeMap<Double, String> map = new TreeMap<>();

        double max = Double.MIN_VALUE;
        String maxName = "";
        String minName = "";
        double min = Double.MAX_VALUE;

        
        for (int i = 0; i < n; i++) {
            String name = f.readLine();
            StringTokenizer st = new StringTokenizer(f.readLine());
            int time = Integer.parseInt(st.nextToken());
            double rating = Double.parseDouble(st.nextToken());
            int scenes = Integer.parseInt(st.nextToken());


           // System.out.println(name);
            double x = Math.abs((((double) time) / ((double) scenes)));
           // System.out.println(x);

            if(x < min) {
                min = x;
                minName  = name;
            }
            if(x > max) {
                max = x;
                maxName = name;
            }

            if(time > 120) {
                continue;
            }
            if(rating < 7) {
                continue;
            }
            if(scenes > 20) {
                continue;
            }
            map.put(x, name);

            


        }

        for(double x : map.keySet()) {
            System.out.println(map.get(x));
            break;
        }


        System.out.print(minName + " ");
        System.out.printf("%.3f\n", min);        
        System.out.print(maxName + " ");
        System.out.printf("%.3f\n", max);



    }
}
