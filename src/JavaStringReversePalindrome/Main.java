package JavaStringReversePalindrome;

import java.util.ArrayList;

import java.util.Collections;


public class Main {
    public static void main(String[] args) {
        String palabra = "madam";
        ArrayList<Character> lista = new ArrayList<>();
        for (int i = 0 ; i < palabra.length() ; i++){
            char letra = palabra.charAt(i);
            lista.add(letra);
        }
        Collections.reverse(lista);// la ponemos alreves
        String nueva = lista.stream().map(String::valueOf).reduce("" , String::concat); // hay que convertir la lista de tipo char a tipo String
        if (nueva.equals(palabra)){
            System.out.println("YES");
        }
        else {
            System.out.println("NO");
        }
    }
}
