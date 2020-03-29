import java.util.*;
import java.util.stream.*;

public class Ex8 {
    public static void main(String[] args) {

        List<Pisica> list = Arrays.asList(
                new Pisica("Kitty", "negru"),
                new Pisica("Mitzy", "alb")
        );

        Map<String, String> map =
                list.stream()
                .collect(Collectors.toMap(Pisica::getNume, Pisica::getCuloare));
                /* .collect(Collectors.toMap(p -> p.getNume(), p -> p.getCuloare()) */

        System.out.println(map);

    }
}
