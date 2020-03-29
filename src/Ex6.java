import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex6 {
    public static void main(String[] args) {
    //vrem sa aflam media aritmetica a preturilor produselor

        List<Produs> produse = Arrays.asList(
                new Produs("cioco", 10),
                new Produs("bere", 5));

        double av =
        produse.stream()
                .collect(Collectors.averagingInt(p -> p.pret));

        System.out.println(av);

    }
}
