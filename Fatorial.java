public class Fatorial {
    public static int fatorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        int numero = 12; 
        int resultado = fatorial(numero);
        System.out.println("O fatorial de " + numero + " resulta em: " + resultado);
    }
}