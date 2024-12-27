import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Lambda {
    public static void main(String[] args) {
        Consumer<String> con = (p1) -> {
            System.out.println("Value consumed is : " + p1);
        };
        
        Predicate<Integer> isOdd = (p1) -> {
            return p1 % 2 == 1;
        };

        Supplier<Integer> randomGenerator = () -> {
            return (int)(Math.random() * 100d);
        };

        Function<String, Integer> getStringLength = (str) -> {
            return str.length();
        };

        con.accept("hello world");
        System.out.println(isOdd.test(5));
        System.out.println(randomGenerator.get());
        System.out.println(getStringLength.apply("null"));
    }
}
