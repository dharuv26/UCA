import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MaxFreqWord {

    class Node {
        String key;
        Integer value;
        Node left;
        Node right;

        Node(String key) {
            this.key = key;
            this.value = 1;
            this.left = null;
            this.right = null;
        }
    }

    Node root;

    MaxFreqWord() {
        this.root = null;
    }

    public Integer get(String key) {
        return get(root, key);
    }

    private Integer get(Node x, String key) {
        if (x == null)
            return null;

        int c = key.compareTo(x.key);
        if (c == 0)
            return x.value;
        else if (c < 0)
            return get(x.left, key);
        else
            return get(x.right, key);
    }

    public void put(String key) {
        if (key.length() < 10)
            return;
        root = put(root, key);
    }

    private Node put(Node x, String key) {
        if (x == null)
            return new Node(key);

        int c = key.compareTo(x.key);
        if (c == 0)
            x.value += 1;
        else if (c < 0)
            x.left = put(x.left, key);
        else
            x.right = put(x.right, key);

        return x;
    }

    public void getMax() {
        while (root.right != null)
            root = root.right;
        System.out.println(root.key + " " + root.value);
    }

    public static void main(String[] args) throws IOException {
        MaxFreqWord mp = new MaxFreqWord();
        FileReader file = new FileReader("file.txt");
        BufferedReader br = new BufferedReader(file);
        while (br.ready()) {
            String line = br.readLine();
            String[] words = line.split(" ");
            for(String word : words) {
                mp.put(word);
            }
        }
        mp.getMax();
    }
}
