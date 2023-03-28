import java.util.*;
import java.io.*;
public class costumecontest {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("costumecontest.in"));
        StringTokenizer st = new StringTokenizer(f.readLine());

        int n = Integer.parseInt(st.nextToken());
        int judges = Integer.parseInt(st.nextToken());
        //treeset (score, treeset(names))
        TreeMap<Integer, TreeSet<String>> map = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            st = new StringTokenizer(f.readLine());
            String name = st.nextToken();
            for (int j = 0; j < judges; j++) {
                sum+=Integer.parseInt(st.nextToken());
            }
            //System.out.println(sum);
            if(!map.containsKey(sum)) {
                TreeSet<String> set = new TreeSet<>();
                set.add(name);
                map.put(sum, set);
            } else {
                map.get(sum).add(name);
            }
        }

        ArrayList<String> list = new ArrayList<>();
        for(int key : map.keySet()) {
            for(String s : map.get(key)) {
                list.add(s);
            }
        }

        for (int i = 1; i <=3; i++) {
            System.out.println(list.get(list.size()-i));
        }
        //System.out.println(list);
        //System.out.println(map);
        
    }
}
