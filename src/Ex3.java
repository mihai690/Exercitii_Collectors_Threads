import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Ex3 {
    public static void main(String[] args) {
        //avand o lista de integers, vrem sa obtinem lista acelor valori ridicate la patrat
        //similar, putem pune valorile intr un Set (nu contine duplicate)
        List<Integer> lista = Arrays.asList(2, 4, 6, 8, 2);

        Set<Integer> rez =
                lista.stream()
                        .map(x -> x*x)
                        .collect(Collectors.toSet());

        System.out.println(rez);

    }
}
