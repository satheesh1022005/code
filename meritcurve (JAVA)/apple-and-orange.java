import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'countApplesAndOranges' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER s
     *  2. INTEGER t
     *  3. INTEGER a
     *  4. INTEGER b
     *  5. INTEGER_ARRAY apples
     *  6. INTEGER_ARRAY oranges
     */

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
            int ra=0,rb=0;
            for(Integer va:apples){
                va+=a;
                if(va>=s&&va<=t){
                    ra++;
                }
            }
            for(Integer va:oranges){
                va+=b;
                if(va>=s&&va<=t){
                    rb++;
                }
            }
            System.out.println(ra+"\n"+rb);
        
    

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int s = Integer.parseInt(firstMultipleInput[0]);

        int t = Integer.parseInt(firstMultipleInput[1]);

        String[] secondMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int a = Integer.parseInt(secondMultipleInput[0]);

        int b = Integer.parseInt(secondMultipleInput[1]);

        String[] thirdMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int m = Integer.parseInt(thirdMultipleInput[0]);

        int n = Integer.parseInt(thirdMultipleInput[1]);

        String[] applesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> apples = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesTemp[i]);
            apples.add(applesItem);
        }

        String[] orangesTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> oranges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesTemp[i]);
            oranges.add(orangesItem);
        }

        Result.countApplesAndOranges(s, t, a, b, apples, oranges);

        bufferedReader.close();
    }
}
