import java.util.*;
import java.io.*;
public class pumpkinnaming {


    public static void main(String[] args) throws Exception {
        BufferedReader f = new BufferedReader(new FileReader("pumpkinnaming.in"));
        int n = Integer.parseInt(f.readLine());
        //System.out.println(n);

        char[] ajs = {'a', 'j', 's'};
        char[] bkt = {'b', 'k', 't'};
        char[] clu = {'c', 'l', 'u'};
        char[] dmv = {'d', 'm', 'v'};
        char[] enw = {'e', 'n', 'w'};
        char[] fqx = {'f', 'o', 'x'};
        char[] gpy = {'g', 'p', 'y'};
        char[] hqz = {'h', 'q', 'z'};
        char[] ir = {'i', 'r'};
        //int i1=0, i2=0, i3=0, i4=0, i5=0, i6=0, i7=0, i8=0, i9=0;


        for (int i = 0; i < n; i++) {
            int i1=0, i2=0, i3=0, i4=0, i5=0, i6=0, i7=0, i8=0, i9=0;

            StringTokenizer st = new StringTokenizer(f.readLine());
            for (int j = 0; j < 3; j++) {
                String[] ar = st.nextToken().split("");
                for (int k = 0; k < ar.length; k++) {
                    int cur = Integer.parseInt(ar[k]);
                    if(cur == 0) {
                        System.out.print(" ");
                    } 
                    if(cur == 1) {
                        System.out.print(ajs[i1]);
                        i1++;
                        i1%=3;
                    }                    if(cur == 2) {
                        System.out.print(bkt[i2]);
                        i2++;
                        i2%=3;
                    }                    if(cur == 3) {
                        System.out.print(clu[i3]);
                        i3++;
                        i3%=3;
                    }                    if(cur == 4) {
                        System.out.print(dmv[i4]);
                        i4++;
                        i4%=3;
                    }                    if(cur == 5) {
                        System.out.print(enw[i5]);                        
                        i5++;
                        i5%=3;
                    }                    if(cur == 6) {
                        System.out.print(fqx[i6]);
                        i6++;
                        i6%=3;
                    }                    if(cur == 7) {
                        System.out.print(gpy[i7]);
                        i7++;
                        i7%=3;
                    }                    if(cur == 8) {
                        System.out.print(hqz[i8]);
                        i8++;
                        i8%=3;
                    }                    if(cur == 9) {
                        System.out.print(ir[i9]);
                        i9++;
                        i9%=2;
                    }
                }
                
            }            
            System.out.println();

        }   
        

    }
}
