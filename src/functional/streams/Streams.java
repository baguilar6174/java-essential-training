package functional.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Streams {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Bryan", "Alex"));
        names.stream().filter((name) -> name.toLowerCase().contains("b")).forEach(System.out::println);
    }
}
