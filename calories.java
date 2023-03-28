import java.util.*;
import java.io.*;
public class calories {
    static Scanner sc;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(new FileReader("calories.in"));
        int n = sc.nextInt();
        int goal = 0;
        int sum = 0;

        int iterations = 0;

        while(sc.hasNextLine()) {
            String s = sc.next();
            if(s.charAt(0) == '*') {
                if(!(iterations == 0)) {
                    print(goal - sum);
                }
                goal = sc.nextInt();
                sum = 0;
                iterations++;
                continue;
            }
            sum+=Integer.parseInt(s);
        }

        print(goal - sum);

        
    }

    static void print(int diff) {
        if(diff == 0) {
            System.out.println("He needs to maintain his weight");
        }
        if(diff < 0) {
            System.out.println("He needs to lose " + (-1 * diff) + " calories");
        }
        if(diff > 0) {
            System.out.println("He needs to gain " + diff + " calories");
        }
    }

}
