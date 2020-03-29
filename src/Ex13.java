import java.util.Optional;

public class Ex13 {

    public static void main(String[] args) {
        Optional <String> o1 = Optional.empty(); //Optional gol in care pot pune String

        Optional <String> o2 = Optional.of("HELLO");
        //of() nu are voie sa primeasca null

        String hello = null;
        Optional <String> o3 = Optional.ofNullable(hello);

        System.out.println(o1.isPresent()); //false
        System.out.println(o2.isPresent()); //true
        System.out.println(o3.isPresent()); //false

        o1.ifPresent(System.out::println); //nu afiseaza nimic
        o2.ifPresent(System.out::println); //HELLO

        o2.filter(s -> s.length() %2 == 0).ifPresent(System.out::println);
        //la ifPresent va ajunge valoarea numai daca respecta predicatul (lung para)
        //daca o2 are lungime para, se ajunge la afisare

        o2.map(s -> s.length()).ifPresent(System.out::println); //5

        String v = o2.orElse("WORLD"); // ce se afiseaza at cand o2 este gol


    }
}
