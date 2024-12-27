import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        List<Integer> evenList = list.stream().filter((p1) -> {
            return p1%2 == 1;
        }).collect(Collectors.toList());

        System.out.println(evenList);
    }
}
