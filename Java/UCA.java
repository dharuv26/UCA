public class UCA<K> {
    K key;

    UCA (K key) {
        this.key = key;
    }

    public static void main(String[] args) {
        UCA<String> uca = new UCA<String>("Hello");
        UCA<Integer> uca2 = new UCA<Integer>(10);
        System.out.println(uca.key + " " + uca2.key);
    }
}