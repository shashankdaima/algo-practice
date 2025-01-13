
import java.io.*;
import java.util.*;

public class MissingNumber {

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
        // 5
        // 2 3 1 5
        FastReader fastReader = new FastReader();
        long n = fastReader.nextLong();
        long sum = 0;
        for (int i = 0; i < n-1; i++) {
            sum += fastReader.nextLong();
        }
        long actualSum=n * (n + 1) / 2;
        System.out.println( actualSum- sum);
    }
}
