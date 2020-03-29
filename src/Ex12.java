import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex12 {
    public static void main(String[] args) {
        //avand o lista de siruri de caract, grupati pe cele cu lungime para de cele imp

        List<String> list = Arrays.asList("aaa", "bb", "dddd", "e", "abcdef");

        Map<Boolean, List<String>> rez =
        list.stream()
            .collect(Collectors.partitioningBy(s -> s.length() % 2 == 0));

        System.out.println(rez);
    }
}
