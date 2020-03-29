import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex11 {
    //in loc de lista string urilor, vom returna un string al sirurilor concatenate,
    //separate intre ele prin virgula
    public static void main(String[] args) {

        List<String> list = Arrays.asList("aaaa", "bbb", "c", "ddddd", "fgh");

        Map<Integer, String> map =
                list.stream()
                    .collect(
                      Collectors.groupingBy(s -> s.length(), //idem cu String::length
                       Collectors.joining(",")));

        System.out.println(map);
    }
}
