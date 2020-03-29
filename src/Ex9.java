import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex9 {
    //avand o lista de siruri de caract, grupati sirurile de caract dupa lungimi
    public static void main(String[] args) {

        List<String> list = Arrays.asList("aaaa", "bbb", "c", "ddddd", "fgh");

        Map<Integer, List<String >> map =
        list.stream()
            .collect(Collectors.groupingBy(s -> s.length()));

        System.out.println(map);
    }
}
