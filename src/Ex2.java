import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex2 {
    public static void main(String[] args) {
        //avand o lista de integers, vrem sa obtinem lista acelor valori ridicate la patrat

        List<Integer> lista = Arrays.asList(2, 4, 6, 8);

        List<Integer> rez =
        lista.stream()
             .map(x -> x*x)
             .collect(Collectors.toList());

        System.out.println(rez);

    }
}
