import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdaExercise2 {
    public static void main(String[] args) {
        Function<Integer, Double> getSqrt = (p1) -> {
            return Math.sqrt(p1);
        };

        Function<String, String> getUpperCase = (str) -> {
            return str.toUpperCase();
        };

        Function<String, String> delExtraSpace = (str) -> {
            return str.strip();
        };

        Function<Supplier<String>, Consumer<String>> supplierConsumerFunction = (supplier) -> {
            final String randomIdFromSupplier = supplier.get();
            Consumer<String> consumer = (randomIdFromConsumer) -> {
                for (int i = 0; i < 10; i++) {
                    System.out.println(i + 1 + " " + randomIdFromConsumer + " " + randomIdFromSupplier);
                }
            };
            return consumer;
        };

        System.out.println(getSqrt.apply(10));
        System.out.println(getUpperCase.apply("abcXYzindds"));
        System.out.println(delExtraSpace.apply("    ajdbauwbf    "));

        supplierConsumerFunction.apply(() -> {
            return String.valueOf("RandomID -- " + (Math.random() * 1000) + " --");
        }).accept("Supplier");

    }
}
