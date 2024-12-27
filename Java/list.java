import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        array.add(1);
        array.add(2);
        array.add(3);

        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);
        
        System.out.println(array);
        System.out.println(linkedList);
    }
}
