import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'marsExploration' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int marsExploration(String s) {
        int count = 0;
        int n = s.length();

        for (int i = 0; i < n; i += 3) {
            count += (s.charAt(i)   != 'S' ? 1 : 0) +
                     (s.charAt(i+1) != 'O' ? 1 : 0) +
                     (s.charAt(i+2) != 'S' ? 1 : 0);
        }

        return count;
    }


    public static int marsExploration2(String s) {
        int count = 0;
        
        for (int i = 0; i < s.length(); i += 3) {
            if (s.charAt(i)   != 'S') count++;
            if (s.charAt(i+1) != 'O') count++;
            if (s.charAt(i+2) != 'S') count++;
        }

        return count;
    }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int result = Result.marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
