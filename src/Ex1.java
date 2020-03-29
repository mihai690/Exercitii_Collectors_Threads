import java.util.*;
import java.util.stream.*;

public class Ex1 {
    public static void main(String[] args) {
        //avand o lista de siruri de caractere, afisati lungimile sirurilor,
        //separate prin virgula.

        List <String> list = Arrays.asList("aaa", "bb", "c", "qqqq");

        String rez =
        list.stream() //conversie din lista in stream
                .map(s -> String.valueOf(s.length())) //transf din siruri de caract in lungimile lor
                .collect(Collectors.joining(","));
        System.out.println(rez);
    }
}
