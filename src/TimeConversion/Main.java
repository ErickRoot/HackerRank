package TimeConversion;

public class Main {
    public static void main(String[] args) {
        //Given a time in
        //
        //-hour AM/PM format, convert it to military (24-hour) time.
        //
        //Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
        //- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

        String hora = "07:05:45AM";
        System.out.println(result.timeConversion(hora));
    }

    public static class result {
        public static String timeConversion(String s) {
            String substring = s.substring(s.length() - 2); // creando un substring que identifique si es AM o PM
            String substringhora = s.substring(0, 2); // separamos la hora
            int hora = Integer.parseInt(substringhora); // convertimos en valor entero

            if (substring.equals("PM")) { // si es PM entonces hace la conversion
                //int nueva = hora + 12; // suma para que este en formato de 24hrs
                if (hora != 12) { // comparamos que el resultado sea menor que 12
                    hora += 12;
                }
            } else {
                if (hora == 12) {
                    hora = 0;
                }
            }
                String subcadena = String.format("%02d", hora);
                String minSeg = s.substring(2, s.length() - 2);
                return subcadena + minSeg;
                /*String subcadena = Integer.toString(nueva); // cnvierte el entero en String para ingresarlo al otro string
                char c1 = subcadena.charAt(0); // seleccionamos el primer caracter de la subcadena y lo alamacenamos
                char c2 = subcadena.charAt(1);
                StringBuilder s1 = new StringBuilder(s); // para poder modificar los caracteres de la cadena.
                s1.setCharAt(0,c1);
                s1.setCharAt(1,c2);
                String s2 = s1.toString().substring(0,s1.length()-2);
                return s2;*/
            }
        }
    }

