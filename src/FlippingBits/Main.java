package FlippingBits;
public class Main {
    public static void main(String[] args) {
        long nuevo = Resutl.flippingBits(1);
        System.out.println(nuevo);
    }

    public class Resutl {
        public static long flippingBits (long n){
            String binario = Long.toBinaryString(n);
            String binarioRelleno = String.format("%32s", binario).replace(' ','0');
            String intercambio = binarioRelleno.replace('0','x').replace('1','0').replace('x','1');
            long nuevo = Long.parseLong(intercambio,2);
            return nuevo;
            // return n ^ 0xFFFFFFFFL;
        }
    }
}
