public class Bst {
    class Node {
        int val;
        Node left;
        Node right;
    }

    private boolean helper(Node node, Integer min, Integer max) {
        if (node == null)
            return true;
        boolean minCondition = min == null || node.val > min;
        boolean maxCondition = max == null || node.val < max;
        return minCondition && maxCondition && helper(node.left, min, node.val) && helper(node.right, node.val, max);
    }

    public boolean isBST(Node root) {
        return helper(root, null, null);
    }
}