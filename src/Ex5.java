import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex5 {
    //avand o lista de liste de siruri de caract, obtineti o lista a lungimilor
    //distincte din toate sirurile si sortate crescator

    public static void main(String[] args) {
        List<List<String>> lista = new ArrayList<>();

        lista.add(Arrays.asList("aaa", "bbbbb", "ccccc", "d"));
        lista.add(Arrays.asList("kkkk", "gggg", "ddd", "dssss"));
        lista.add(Arrays.asList("ertyu", "qasfds", "dsf", "dwefrgd"));

        List<Integer> valori =

        lista.stream()
             .flatMap(k -> k.stream()) //transf din List in String
             .map(s -> s.length())
             .distinct() //unice
             .sorted()
             .collect(Collectors.toList());

        System.out.println(valori);
    }
}
