public class SomatorioIntervalo {
    public static int somatorioIntervalo(int k, int j) {
        if (k > j) {
            return 0;
        }
        if (k == j) {
            return k;
        }
        return k + somatorioIntervalo(k + 1, j);
    }

    public static void main(String[] args) {
        int k = 0; 
        int j = 10; 
        int resultado = somatorioIntervalo(k, j);
        System.out.println("O somatorio dos numeros entre " + k + " e " + j + " resulta em: " + resultado);
    }
}