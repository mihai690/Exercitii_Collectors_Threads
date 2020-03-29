import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {
    public static void main(String[] args) {
        //daca dorim sa returnam valorile intr un anumit tip de colectie:
        //ArrayList, LinkedList, HashSet, etc

        List<Integer> lista = Arrays.asList(2, 4, 6, 8, 2);

        ArrayList<Integer> rez =
                lista.stream()
                        .map(x -> x*x)
                        .collect(Collectors.toCollection(() -> new ArrayList<>()));
        /* sau       .collect(Collectors.toCollection(ArrayList::new)); */

        System.out.println(rez);

    }
}
