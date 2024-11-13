package Valid_Username_Regular_Expression;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String nombre = "!MariaDaniela";
        char[] valores = {1, 2, 3, 4, 5, 6, 7, 8, 9, ',', ':', ';', '!', '`', '@', '#', '%', '^', '&', '*', '(', ')', '-', '=', '+'};
        char letra = nombre.charAt(0);
        System.out.println(letra);
        for (char valor : valores){
            if (letra ==valor){
                System.out.println("invalido");
            }

        }
        System.out.println("valido");
    }
}
/*
 * Tengo que verificar si es major de 8 caractes, si es mayor de 8 entonces es valido
 * si tiene mas de 8 caractes --> tengo que validar que no empiece con un numero
 * si no empieza con un numero tengo que validar que no tenga ningun caracter especial en su contenido
 * tiene mas de 8 caracteres ? Si --> tiene un numero al inicio ? No --> Tiene algun caracter especial? No ---> VALIDO
 * tiene mas de 8 caracteres ? Si --> tiene un numero al inicio ? Si --> INVALIDO
 * tiene mas de 8 caracteres ? No -- INVALIDO */