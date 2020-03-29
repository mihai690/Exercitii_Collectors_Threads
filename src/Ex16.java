import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex16 {
    public static void main(String[] args) {
        //grupam sirurile dupa lungime in functie de dimensiunea lungimii
        //cate siruri avem cu lungimea x
        List<String> list = Arrays.asList("aa", "bbb", "cc", "abcd", "aaa", "erty");

        /*
        * 2 2
        * 3 2
        * 4 2
         */
        Map<Integer, Long> map =
                list.stream()
                .collect(Collectors.groupingBy(s -> s.length(), Collectors.counting()));
        System.out.println(map);
    }
}
