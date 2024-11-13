package JavaStringReverse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();*/
        List<Integer> numeros = new ArrayList<>(6);
        numeros.add(-4);
        numeros.add(3);
        numeros.add(-9);
        numeros.add(0);
        numeros.add(4);
        numeros.add(1);
        plusMinus(numeros);

    }

    public static void plusMinus(List<Integer> arr) {
        double pos = 0, neg = 0, cer = 0;
        for (int i = 0; i <= arr.size()-1; i++) {
            if (arr.get(i) > 0) {
                pos++;
            } else if (arr.get(i) < 0) {
                neg++;
            } else {
                cer++;
            }
        }
        double positivos = pos / arr.size();
        double negativo = neg / arr.size();
        double cero = cer / arr.size();

        System.out.printf("%.6f\n", positivos);
        System.out.printf("%.6f\n", negativo);
        System.out.printf("%.6f\n", cero);

    }
}
