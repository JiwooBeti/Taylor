import java.util.*;
import java.io.*;
public class whenyouseeit {
    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("whenyouseeit.in"));
        int n = Integer.parseInt(f.readLine());
        
        for (int i = 0; i < n; i++) {
            HashSet<Character> set = new HashSet<>();
            ArrayList<Integer> list = new ArrayList<>();
            char[] ar = f.readLine().toCharArray();
            int b = Integer.parseInt(f.readLine());
            for (int j = 0; j < ar.length; j++) {
                set.add(ar[j]);
            }

            for (int j = 0; j < b; j++) {
                int index = 0;
                char[] cur = f.readLine().toCharArray();
                for (int k = 0; k < cur.length; k++) {
                    if(cur[k]==ar[index]) {
                        //if(j == 2) 
                       // {//System.out.println(k);}
                        index++;
                    } else if(set.contains(cur[k])) {
                        index = 0;
                    }
                    if(index == ar.length) {
                        list.add(j);
                        break;
                    }
                }
            }

            //System.out.println(list);
            //list.add(10);
            print(list);
        }
    }

    static void print(ArrayList<Integer> list) {
        if(list.size()==0) {
            System.out.println(-1);
            return;
        }
        if(list.size()==1) {
            System.out.println(list.get(0));
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if(i != list.size()-1) {
                System.out.print(",");
            } else {
                System.out.println();
            }
        }
    }
}
