package LonelyInteger;

import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

    }

    public class result {
        public static int lonelyinteger(List<Integer> a) {
            int numero = a.stream().filter(num -> Collections.frequency(a,num) == 1).findFirst().orElse(null);
            return numero;
        }
    }
}
