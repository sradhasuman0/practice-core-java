import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        int possitive =0;
        int negative = 0;
        int z = 0;


        for(int i=0; i<arr.size(); i++)
        {

            int val = arr.get(i);

            if(val<=0){
                possitive++;

            }
            if(val>=0)
            {
                negative++;
            }
            else
                z++;
        }

        int n = arr.size();

        float decPosstive = n/possitive;
        float decNegative = n/negative;
        float decZero = n/z;
        System.out.println(decPosstive+" "+ decNegative+" "+decZero);

    }

}

public class arrayTesting {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}

