package Java_Strings_Introduction;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*There are three lines of output:
        For the first line, sum the lengths of A and B.
        For the second line, write Yes if A is lexicographically greater than B otherwise print No instead.
        For the third line, capitalize the first letter in both A and B and print them on a single line, separated by a space.*/
        Scanner scanner = new Scanner(System.in);

        String a1 = scanner.nextLine();
        String b2 = scanner.nextLine();
        String a = a1.toLowerCase();
        String b = b2.toLowerCase();
        scanner.close();
        int lengthA = a.length();
        int lengthB = b.length();
        System.out.println(lengthA+lengthB);
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        char letA = a.charAt(0), letB = b.charAt(0);
        int valorLetra=0, valorLetra2 = valorLetra;

        for (int i = 0 ; i < alfabeto.length(); i++){
            char letra = alfabeto.charAt(i);
            if (letA == letra){
                valorLetra = i;
            }
        }
        for (int j = 0 ; j < alfabeto.length(); j++){
            char letra = alfabeto.charAt(j);
            if (letB == letra){
                valorLetra2 = j;
            }
        }
        if (valorLetra<=valorLetra2){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }
        String palabra = a.toUpperCase().substring(0,1)+a.substring(1);
        String palabra2 = b.toUpperCase().substring(0,1)+b.substring(1);
        System.out.println(palabra+" "+palabra2);
    }
}
