public class Binario {
    public static String convBase2(int n) {
        if (n == 0) {
            return "0";
        }
        if (n == 1) {
            return "1";
        }
        return convBase2(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        int numero = 10;
        int numero2 = 3;
        String binario = convBase2(numero);
        System.out.println("O numero " + numero + " em binario resulta em: " + binario);
        System.out.println("O numero " + numero2 + " em binario resulta em: " + convBase2(numero2));
    }
}