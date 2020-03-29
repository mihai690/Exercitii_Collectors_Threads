import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex10 {

    public static void main(String[] args) {
        //facem o lista de produse si le grupam dupa pretul lor

        List<Produs> list = Arrays.asList(
                new Produs("lapte", 5),
                new Produs("paine", 1),
                new Produs("faina", 1),
                new Produs("gris", 2),
                new Produs("banane", 3)
        );

        Map<Integer, List<Produs> > map =
        list.stream()
            .collect(Collectors.groupingBy(s -> s.pret));

        System.out.println(map);
    }
}
