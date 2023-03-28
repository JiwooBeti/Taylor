import java.util.*;
import java.io.*;
public class organstockmarket {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new FileReader("organstockmarket.in"));
        double start = sc.nextDouble();
        int n = sc.nextInt();
        sc.next();
        HashMap<String, Double> map = new HashMap<>();
        for(int i = 0; i < n; i++) {
            String name = sc.next();
            double price = sc.nextDouble();

            map.put(name, price);
        }

        //System.out.println(map);
        sc.next();

        while(sc.hasNextLine()) {
            
            String first = sc.next();
            //System.out.println(first);
            if(map.containsKey(first)) {
                //up or down
                if(sc.next().equals("up")) {
                    //double d = map.get(first);
                    //map.get(first)=sc.nextDouble();
                    map.put(first, map.get(first) * sc.nextDouble()/100 + map.get(first));
                } else {
                    map.put(first, map.get(first) * (100-sc.nextDouble())/100);
                }
                //sc.next();
            } else {
                if(first.equals("Buy")) {
                    start-=map.get(sc.next());
                    
                } else if(first.equals("Sell")) {
                    start+=map.get(sc.next());
                }
            }
        }
        System.out.printf("%.2f", start);
    }
}
