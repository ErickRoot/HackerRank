package DiagonalDifference;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> matriz = Arrays.asList(Arrays.asList(11,2,4),Arrays.asList(4,5,6),Arrays.asList(10,8,-12));
        int resultado = Result.diagonalDifference(matriz);
        System.out.println(resultado);
    }
    public class Result {
        public static int diagonalDifference(List<List<Integer>> arr){
            int n = arr.size();
            int valor1 = 0;
            int valor2 = 0;
            for (int i=0; i < arr.size() ; i++){
                valor1 += arr.get(i).get(i);
                valor2 += arr.get(i).get(arr.size()-i-1);//
            }
            return valor1 - valor2;
        }
    }
}
