package SparseArrays;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*There is a collection of input strings and a collection of query strings. For each query string, determine how many times it occurs in the list of input strings. Return an array of the results.
         * */
    }

    class Result {
        public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
            List<Integer> arreglo = new ArrayList<>(queries.size());
            for (String query : queries ) {
                int contador = 0;
                for (String string : strings) {
                    if (query.equals(string)) {
                        contador++;
                    }
                }
                arreglo.add(contador);
            }
            return arreglo;
        }
    /*4 --- strings
    aba
    baba
    aba
    xzxb
        3 --- queries
        aba
        xzxb
        ab*/
    }
}
