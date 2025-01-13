
import java.io.*;
import java.util.*;

public class Repetitions {

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
        String line = fastReader.next();
        int slwPointer = 0;
        int result=Integer.MIN_VALUE;
        for (int fastPointer = 0; fastPointer < line.length(); fastPointer++) {
            if(line.charAt(fastPointer)!=line.charAt(slwPointer)){
                slwPointer=fastPointer;
            }
            result=Integer.max(result,fastPointer-slwPointer+1);
        }
        System.out.println(result);
    }

}
