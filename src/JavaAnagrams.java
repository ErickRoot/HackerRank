import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.lang.System.*;

public class JavaAnagrams {
    public static void main(String[] args) {
        Solution nuevo = new Solution();
        String resultado = nuevo.solucion("aloha", "Hola");
        out.println(resultado);
    }
}

class Solution {
    public String solucion(String a, String b) {
        a = a.toUpperCase();
        b = b.toUpperCase();
        List<Character> listaA = new ArrayList<>();
        List<Character> listaB = new ArrayList<>();
        for (int i = 0; i < a.length(); i++) {
            char letraA = a.charAt(i);
            listaA.add(letraA);
        }
        for (char letraB : b.toCharArray()) {
            listaB.add(letraB);
        }
        Collections.sort(listaA);
        Collections.sort(listaB);
        String palA = listaA.stream().map(String::valueOf).reduce("", String::concat);
        String palB = listaB.stream().map(String::valueOf).reduce("", String::concat);
        if (palA.equals(palB)) {
            return "Anagrams";
        } else {
            return "No Anagrams";
        }
        /*REFACTORIZACION DEL CODIGO
        * // Convertir ambas cadenas a mayúsculas, ordenar sus caracteres y comparar
        char[] arrA = a.toUpperCase().toCharArray();
        char[] arrB = b.toUpperCase().toCharArray();

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        return Arrays.equals(arrA, arrB) ? "Anagrams" : "No Anagrams";*/
    }
}

