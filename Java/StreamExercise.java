import java.util.*;
import java.util.stream.Collectors;

public class StreamExercise {
    public static void main(String[] args) {
        
        // List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");

        // // Filter the names with starting letter 'A'
        // List<String> filtered = names.stream().filter((name) -> name.charAt(0) ==
        // 'A').collect(Collectors.toList());
        // System.out.println(filtered);

        // // Uppercase all the names
        // List<String> upper = names.stream().filter((name) -> name != null).map((name)
        // -> name.toUpperCase()).collect(Collectors.toList());
        // System.out.println(upper);

        // // Combine all names
        // String combined = names.stream().filter(Objects::nonNull).reduce("Combined
        // name : ", (name1, name2) -> name1 + name2);
        // System.out.println(combined);


        // List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // // Add using streams
        // Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
        // System.out.println(sum);


        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Ash", "Alice");
        System.out.println(names.parallelStream().collect(Collectors.groupingBy(name -> name.charAt(0))));
        Map<String, Long> countMap = names.stream().collect(Collectors.groupingBy(name -> name, Collectors.counting()));
        System.out.println(countMap);
        Map<Integer, List<String>> countLength = names.stream().collect(Collectors.groupingBy((name) -> name.length()));
        System.out.println(countLength);
    }
}
