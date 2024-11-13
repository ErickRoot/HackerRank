package Min_Max_Sum;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(140638725 ,436257910 ,953274816 ,734065819 ,362748590);
        miniMaxSum(numeros);
    }
    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        Collections.sort(arr); // ordenar de forma ascendente
        long min = arr.stream().mapToLong(Integer::longValue).limit(arr.size()-1).reduce(0, (a,b)-> a+b);
        long max = arr.stream().skip(1).mapToLong(Integer::longValue).sum();

        System.out.println(min+" "+max);

    }
}
