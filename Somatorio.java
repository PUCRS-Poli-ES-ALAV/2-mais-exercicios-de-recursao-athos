public class Somatorio {
    public static int somatorio(int n) {
        if (n == 0) {
            return 0;
        }
        return n + somatorio(n - 1);
    }

    public static void main(String[] args) {
        int numero = 4;
        int resultado = somatorio(numero);
        System.out.println("O somatorio de " + numero + " ate 0 resulta em: " + resultado);
    }
}