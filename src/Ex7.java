import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex7 {
    public static void main(String[] args) {
        //transformam aceeasi lista intr un map cu cheia = nume si valoarea = pret

        List<Produs> produse = Arrays.asList(
                new Produs("cioco", 4),
                new Produs("suc", 5));

        Map<String, Integer> map =
                produse.stream()
                .collect(Collectors.toMap(p -> p.nume, p -> p.pret));


        System.out.println(map);

    }
}
