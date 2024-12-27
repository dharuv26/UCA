class A implements Comparable<A> {
    int x;

    public int compareTo(A y) {
        if (x < y.x)
            return -1;
        else if (x == y.x)
            return 0;
        else
            return 1;
    }
}

public class BinarySearchTree<Key extends Comparable<Key>, Value> {
    class Node {
        Key key;
        Value value;
        Node left;
        Node right;
        int count;

        Node(Key key, Value value, int count) {
            this.key = key;
            this.value = value;
            this.left = null;
            this.right = null;
            this.count = count;
        }
    }

    Node root;

    BinarySearchTree() {
        this.root = null;
    }

    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node x, Key key) {
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

    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    private Node put(Node x, Key key, Value value) {
        if (x == null)
            return new Node(key, value, 1);
        int c = key.compareTo(x.key);
        if (c == 0)
            x.value = value;
        else if (c < 0)
            x.left = put(x.left, key, value);
        else
            x.right = put(x.right, key, value);

        x.count = 1 + size(x.left) + size(x.right);

        return x;
    }

    public Key floor(Key key) {
        Node x = floor(root, key);
        if (x == null)
            return null;
        else
            return x.key;
    }

    private Node floor(Node x, Key key) {
        if (key == null)
            return null;
        int c = key.compareTo(x.key);
        if (c == 0)
            return x;
        else if (c < 0)
            return floor(x.left, key);
        Node t = floor(x.right, key);
        if (t == null)
            return x;
        else
            return t;
    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if(x == null) return 0;
        return x.count;
    }

    public int rank(Key key) {
        Integer x = rank(root, key);
        if (x == null)
            return 0;
        else
            return x;
    }

    private Integer rank(Node x, Key key) {
        if (key == null)
            return null;
        int c = key.compareTo(x.key);
        if (c == 0)
            return x.count;
        else if (c < 0)
            return rank(x.left, key);
        Integer t = rank(x.right, key);
        if (t == null)
            return x.count;
        else
            return t;
    }

    // public Key ceil(Key key) {
    //     return ceil(root, key);
    // }

    // private Key ceil(Node x, Key key) {

    // }

    // traversals -> preorder, inorder, postorder
    // delete

    public static void main(String[] args) {
        BinarySearchTree<Integer, Integer> bst = new BinarySearchTree<>();
        bst.put(5, 3);
        bst.put(3, 5);
        bst.put(1, 6);
        bst.put(7, 3);
        bst.put(9, 1);

        System.out.println(bst.get(7));
    }
}
