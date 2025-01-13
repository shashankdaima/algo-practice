
import java.io.*;
import java.util.*;

public class IncreasingArray {

    static class FastReader {

        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }

  

    public static void main(String[] args) {
        FastReader fastReader = new FastReader();
        int n = fastReader.nextInt();
        // int[] arr = new int[n];
        int value=Integer.MIN_VALUE;
        int prev=0;
        long result=0;
        for (int i = 0; i < n; i++) {
            value= fastReader.nextInt();
            if(i==0){
                prev=value;
            }else{
                int temp=Math.max(0, prev-value);
                // System.out.println(".()"+temp);
                result+=temp;
                prev=value+temp;
            }
        }
        System.out.println(result);
        // mergeSort(arr, 0, arr.length - 1);

    }
}
// 10
// 6 10 4 10 2 8 9 2 7 7