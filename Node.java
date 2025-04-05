public class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}
public class BinaryTree {
    Node root;
    int diameter = 0;
    int height(Node node) {
        if (node == null)
            return 0;
        int leftH = height(node.left);
        int rightH = height(node.right);
        diameter = Math.max(diameter, leftH+ rightH);
        return Math.max(leftH, rightH) + 1;
    }
    int getDiameter() {
        height(root);
        return diameter;
    }
   
}
