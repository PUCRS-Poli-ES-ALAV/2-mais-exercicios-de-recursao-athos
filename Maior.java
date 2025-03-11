import java.util.ArrayList;
public class Maior {
    public static int findBiggest(ArrayList<Integer> lista) {
        if (lista.size() == 1) {
            return lista.get(0);
        }
        int primeiro = lista.get(0);
        lista.remove(0); 
        int maiorRestante = findBiggest(lista);
        return Math.max(primeiro, maiorRestante);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(7);
        numeros.add(213);
        numeros.add(41);
        numeros.add(9);
        int maior = findBiggest(numeros);
        System.out.println("Maior elemento: " + maior);
    }
}