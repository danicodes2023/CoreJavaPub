import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jane", "Joan", "George", "Dani");
        //names.stream().filter(n -> n.startsWith("J")).forEach(System.out::println);
        names = names.stream().filter(s -> s.contains("e")).
                map(s -> s.toUpperCase(Locale.ROOT)).
                //forEach(System.out::println);
                collect(Collectors.toList());
        names.forEach(System.out::println);
    }
}
