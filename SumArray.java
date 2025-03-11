import java.util.ArrayList;
public class SumArray {
    public static int somatorioArrayList(ArrayList<Integer> lista) {
        if (lista.isEmpty()) {
            return 0;
        }
        int primeiro = lista.get(0);
        lista.remove(0); 
        return primeiro + somatorioArrayList(lista);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);

        int resultado = somatorioArrayList(numeros);
        System.out.println("O somatorio dos numeros resulta em: " + resultado);
    }
}