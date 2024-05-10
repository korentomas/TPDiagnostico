package tpdiagnostico;

import java.util.ArrayList;
import java.util.List;

public class ListAnalyzer {
    public static int contadorImpares(List<Integer> lista) {
        int count = 0;
        for (int num : lista) {
            if (num % 2 != 0) {
                count++;
            }
        }
        return count;
    }
    public static List<Integer> numerosConsecutivos(List<Integer> lista) {
        List<Integer> consecutivos = new ArrayList<>();
        for (int i = 0; i < lista.size() - 1; i++) {
            if (lista.get(i + 1) == lista.get(i) + 1) {
                if (!consecutivos.contains(lista.get(i))) {
                    consecutivos.add(lista.get(i));
                }
                consecutivos.add(lista.get(i + 1));
            }
        }
        return consecutivos;
    }
}
