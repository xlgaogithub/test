package stream;

import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Test initialize a Map using Stream.of (https://www.baeldung.com/java-initialize-hashmap) and filter using forEach
 */
public class InitializeAndFilter {

    private Map<Integer, List<Integer>> catalog = new ConcurrentHashMap<>();

    public InitializeAndFilter() {
        this.catalog = Stream.of(
                new AbstractMap.SimpleEntry<>(1, Stream.of(10, 11, 12, 13).collect(Collectors.toList())),
                new AbstractMap.SimpleEntry<>(2, Stream.of(20, 21, 22, 23).collect(Collectors.toList())))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    public void filter() {
        this.catalog.forEach((k, v) -> {
            String collect = v
                    .stream()
                    .map(Object::toString)
                    .collect(Collectors.joining("-"));

            System.out.println(collect);
        });
    }


    public static void main(String[] args) {
        InitializeAndFilter instance = new InitializeAndFilter();
        System.out.println(instance.catalog);
        instance.filter();
    }
}
