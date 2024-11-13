package JavaSubStringComparisons;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // Se debe de tener una funcion que recibe un String y un int el cual indica de que
        // largo seran los SubString que se generen apartir del String recibido y
        // los sub string se deben de mostrar en orden algabetico.
        /*String muestra = getSmallestAndLargest("welcometojava", 3);
        System.out.println(muestra);*/

        System.out.println(getSmallestAndLargest("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs", 30));


    }
    public static String getSmallestAndLargest(String s, int k) {
        List<String> subcadena = new ArrayList<>();
        for (int i = 0 ; i < s.length()- k + 1; i++){
            subcadena.add(s.substring(i, i+k));
        }
        Collections.sort(subcadena);
        String smallest = subcadena.get(0);
        String largest = subcadena.get(subcadena.size()-1);
        return smallest + "\n" + largest;
    }
}
