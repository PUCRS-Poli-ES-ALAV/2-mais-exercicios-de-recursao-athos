public class Palindromo {
    private static boolean isPal(String s, int inicio, int fim) {
        if (inicio >= fim) {
            return true;
        }
        if (s.charAt(inicio) != s.charAt(fim)) {
            return false;
        }
        return isPal(s, inicio + 1, fim - 1);
    }

    public static boolean isPal(String s) {
        return isPal(s, 0, s.length() - 1);
    }

    public static void main(String[] args) {
        String palavra = "arara"; 
        String palavra2 = "arar";
        String palavra3 = "martelo";
        boolean resultado = isPal(palavra);
        System.out.println("A palavra \"" + palavra + "\" e um palindromo? " + resultado);
        System.out.println("A palavra \"" + palavra2 + "\" e um palindromo? " + isPal(palavra2));
        System.out.println("A palavra \"" + palavra3 + "\" e um palindromo? " + isPal(palavra3));
    }
}