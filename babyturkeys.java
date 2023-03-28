import java.util.*;
import java.io.*;
public class babyturkeys {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("babyturkeys.in"));
        int n = Integer.parseInt(f.readLine());

        //  hashmap parent, treemap(number, baby)
        HashMap<String, TreeMap<Double, String>> map = new HashMap<>();

        

        for (int i = 0; i < n; i++) {
            String[] ar = f.readLine().split(",");
            //System.out.println(ar.length);
            //System.out.println(Arrays.toString(ar));
            if(map.containsKey(ar[1])) {
                map.get(ar[1]).put(Double.parseDouble(ar[2]), ar[0]);
            } else {
                map.put(ar[1], new TreeMap<>());
                map.get(ar[1]).put(Double.parseDouble(ar[2]), ar[0]);
            }

            //System.out.println(map);
        }

        int t = Integer.parseInt(f.readLine());

        //System.out.println(map);

        for (int i = 0; i <t ; i++) {
            String name = f.readLine();
            String s = "";
            for(double key : map.get(name).keySet()) {
                 s = map.get(name).get(key);
            }

            System.out.println(s);

        }

        //System.out.println(n);
    }
}
